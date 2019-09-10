
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>订单列表 - Powered By SHOP++</title>
    <meta name="author" content="SHOP++ Team" />
    <meta name="copyright" content="SHOP++" />
    <link href="../../resources/admin/css/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../../resources/admin/js/jquery.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/common.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/list.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/vue.min.js"></script>
    <style type="text/css">
        .moreTable th {
            width: 80px;
            line-height: 25px;
            padding: 5px 10px 5px 0px;
            text-align: right;
            font-weight: normal;
            color: #333333;
            background-color: #f8fbff;
        }

        .moreTable td {
            line-height: 25px;
            padding: 5px;
            color: #666666;
        }
    </style>
    <script type="text/javascript">
        $().ready(function() {

            var $listForm = $("#listForm");
            var $filterMenu = $("#filterMenu");
            var $filterMenuItem = $("#filterMenu li");
            var $moreButton = $("#moreButton");
            var $print = $("#listTable select[name='print']");


            // 筛选菜单
            $filterMenu.hover(
                function() {
                    $(this).children("ul").show();
                }, function() {
                    $(this).children("ul").hide();
                }
            );

            // 筛选
            $filterMenuItem.click(function() {
                var $this = $(this);
                var $dest = $("#" + $this.attr("name"));
                if ($this.hasClass("checked")) {
                    $dest.val("");
                } else {
                    $dest.val($this.attr("val"));
                }
                $listForm.submit();
            });

            // 更多选项
            $moreButton.click(function() {
                $.dialog({
                    title: "更多选项",
                    content:
                        '<table id="moreTable" class="moreTable">' +
                        ' <tr>' +
                        '    <th> ' +
                        '       类型: ' +
                        '   </th>' +
                        '   <td>' +
                        '       <select name="type"> ' +
                        '           <option value="">请选择...</option>' +
                        '           <option value="general">普通订单</option>' +
                        '           <option value="exchange">兑换订单</option>' +
                        '       </select>' +
                        '   </td>' +
                        '</tr>' +
                        ' <tr>' +
                        ' <th> 状态: </th>' +
                        ' <td> ' +
                        '   <select name="status">' +
                        '        <option value="">请选择...</option>' +
                        '        <option value="pendingPayment">等待付款</option>' +
                        '        <option value="pendingReview">等待审核</option>' +
                        '        <option value="pendingShipment">等待发货</option>' +
                        '        <option value="shipped">已发货</option>' +
                        '        <option value="received">已收货</option>' +
                        '        <option value="completed">已完成</option>' +
                        '        <option value="failed">已失败</option>' +
                        '        <option value="canceled">已取消</option>' +
                        '        <option value="denied">已拒绝</option>' +
                        '        <option value="notevaluated">Order.Status.notevaluated</option>' +
                        '    </select>' +
                        ' </td>' +
                        '</tr>' +
                        '<tr>' +
                        ' <th> 会员: </th>' +
                        ' <td>' +
                        '   <input type="text" name="memberUsername" class="text" value="" maxlength="200" />' +
                        ' </td>' +
                        '</tr>' +
                        '</table>',
                    width: 470,
                    modal: true,
                    ok: "确 定",
                    cancel: "取 消",
                    onOk: function() {
                        $("#moreTable :input").each(function() {
                            var $this = $(this);
                            $("#" + $this.attr("name")).val($this.val());
                        });
                        $listForm.submit();
                    }
                });
            });

            // 打印选择
            $print.change(function() {
                var $this = $(this);
                if ($this.val() != "") {
                    window.open($this.val());
                }
            });

            searchOrders();

        });

        var vm = new Vue({
            el: "#listForm",
            data: {
                ordersCombine: '',
                pageSize: '',
                pageNum: '',
                total: ''
            }
        });
        var orderPage=new Vue({
          el:'#orderPages',
          data:{
              pageTotal:''
          }
        })
        function searchOrders() {
            //查询订单
            $.ajax({
                url:"/orders/findOrders.do",
                type:"post",
                data:$("listForm").serialize(),
                dataType:"json",
                success:function(data){
                    vm.ordersCombine=data.rows;
                    vm.total=data.total;
                    vm.pageNum=data.pageNum;
                    vm.pageSize=data.pageSize;
                    orderPage.pageTotal=data.totalPage;
                },
                error:function(){
                    alert("错误");
                }
            })
        }

        function delOrders(id) {
            $.ajax({
                url:"orders/delOrders.do",
                type:"post",
                data:{id:id},
                dataType:"json",
                success:function(data){
                    if(data.success) {
                        searchOrders();
                    }else{
                        alert(data.message)
                    }
                },
                error:function(){
                    alert("错误");
                }
            })
        }
    </script>
</head>
<body>
<div class="breadcrumb" id="orderPages">
    <a href="index.jsp">首页</a> &raquo; 订单列表 <span v-model="pageTotal">(共0条记录)</span>
</div>
<form id="listForm" action="list" method="post">
    <input type="hidden" id="type" name="type" value="" />
    <input type="hidden" id="status" name="status" value="" />
    <input type="hidden" id="memberUsername" name="memberUsername" value="" />
    <input type="hidden" id="isPendingReceive" name="isPendingReceive" value="" />
    <input type="hidden" id="isPendingRefunds" name="isPendingRefunds" value="" />
    <input type="hidden" id="isAllocatedStock" name="isAllocatedStock" value="" />
    <input type="hidden" id="hasExpired" name="hasExpired" value="" />
    <div class="bar">
        <div class="buttonGroup">
            <a href="javascript:;" id="refreshButton" class="iconButton">
                <span class="refreshIcon">&nbsp;</span>刷新
            </a>
            <div id="filterMenu" class="dropdownMenu">
                <a href="javascript:;" class="button">
                    订单筛选<span class="arrow">&nbsp;</span>
                </a>
                <ul class="check">
                    <li name="isPendingReceive" val="true">等待收款</li>
                    <li name="isPendingReceive" val="false">无需收款</li>
                    <li class="divider">&nbsp;</li>
                    <li name="isPendingRefunds" val="true">等待退款</li>
                    <li name="isPendingRefunds" val="false">无需退款</li>
                    <li class="divider">&nbsp;</li>
                    <li name="isAllocatedStock" val="true">已分配库存</li>
                    <li name="isAllocatedStock" val="false">未分配库存</li>
                    <li class="divider">&nbsp;</li>
                    <li name="hasExpired" val="true">已过期</li>
                    <li name="hasExpired" val="false">未过期</li>
                </ul>
            </div>
            <a href="javascript:;" id="moreButton" class="button">更多选项</a>
            <div id="pageSizeMenu" class="dropdownMenu">
                <a href="javascript:;" class="button">
                    每页显示<span class="arrow" v-model="pageNum">&nbsp;</span>
                </a>
                <ul>
                    <li val="10">10</li>
                    <li class="current" val="20">20</li>
                    <li val="50">50</li>
                    <li val="100">100</li>
                </ul>
            </div>
        </div>
        <div id="searchPropertyMenu" class="dropdownMenu">
            <div class="search">
                <span class="arrow">&nbsp;</span>
                <input type="text" id="searchValue" name="searchValue" value="" maxlength="200" />
                <button type="submit">&nbsp;</button>
            </div>
            <ul>
                <li val="sn">编号</li>
                <li val="consignee">收货人</li>
                <li val="areaName">地区</li>
                <li val="address">地址</li>
                <li val="zipCode">邮编</li>
                <li val="phone">电话</li>
            </ul>
        </div>
    </div>
    <table id="listTable" class="list">
        <tr>
            <th>
                <a href="javascript:;" class="sort" name="sn">编号</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="amount">订单金额</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="member">会员</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="business">店铺</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="consignee">收货人</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="paymentMethodName">支付方式</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="shippingMethodName">配送方式</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="status">状态</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="createdDate">创建日期</a>
            </th>
            <th>
                <span>打印</span>
            </th>
            <th>
                <span>操作</span>
            </th>
        </tr>
        <tr v-for="entity in ordersCombine">
            <td>{{entity.orders.sn}}</td>
            <td>{{entity.orders.amount}}</td>
            <td>{{entity.member.username}}</td>
            <td>{{entity.store.name}}</td>
            <td>{{entity.orders.consignee}}</td>
            <td>{{entity.paymentmethod.name}}</td>
            <td>{{entity.shippingmethod.name}}</td>
            <td>{{entity.orders.status}}</td>
            <td></td>
            <td>
                <button type="button" class="btn btn-danger btn-xs" v-on:click="delOrders(entity.orders.id)">删除</button>
            </td>
        </tr>
    </table>
    <input type="hidden" id="pageSize" name="pageSize" value="20" />
    <input type="hidden" id="searchProperty" name="searchProperty" value="" />
    <input type="hidden" id="orderProperty" name="orderProperty" value="" />
    <input type="hidden" id="orderDirection" name="orderDirection" value="" />
</form>
</body>
</html>