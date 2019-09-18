<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>店铺列表 - Powered By SHOP++</title>
    <meta name="author" content="SHOP++ Team" />
    <meta name="copyright" content="SHOP++" />
    <link href="../../resources/admin/css/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../../resources/admin/js/jquery.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/common.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/list.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/vue.min.js"></script>
    <script type="text/javascript">
        $(function() {
            findStore();
            vm = new Vue({
                el:'#listForm',
                data:{
                    stores:'',
                    pageSize:'',
                    pageNum:'',
                    storePage:'',
                    checkboxIds:[]
                }
            });
            storeVue = new Vue({
                el: '#storeVue',
                data: {
                    message : "查询到" + 0 + "条信息"
                }
            });
        });
        function findStore() {
            $.ajax({
                url:"/store/findStore.do",
                type:"post",
                data:$("#listForm").serialize(),
                dataType:"json",
                success:function(data){
                        vm.stores=data.rows;
                        vm.pageSize=data.pageSize;
                        vm.pageNum=data.pageNum;
                        vm.storePage=data.total;
                        storeVue.message="查询到"+data.total+"条信息"
                    },
                error:function(){
                    alert("错误");
                }
            })
        }

        //查询列表
        function searchStore() {
            $.ajax({
                url:"/store/findStore.do",
                type:"post",
                data:$("#listForm").serialize(),
                dataType:"json",
                success:function(data){
                    vm.stores=data.rows;
                    vm.pageSize=data.pageSize;
                    vm.pageNum=data.pageNum;
                    vm.storePage=data.total;
                    storeVue.message="查询到"+data.totalPage+"条信息"
                },
                error:function(){
                    alert("错误");
                }
            })
        }

        //修改跳页面
        function editStore(id) {
            window.location.href="editStore.html?id="+id;
        }

        //新增页面
        function add() {
            window.location.href="addstore.jsp";
        }

        //删除
        function del() {
            //获取选中的店铺
            var id='';
            var ids=vm.checkboxIds;
            for (var i = 0; i < ids.length; i++) {
                id+=","+ids[i];
            }
            id=id.substr(1);
            $.ajax({
                url:"/store/delStore.do",
                type:"post",
                data:{id:id},
                dataType:"json",
                success:function(data){
                    if(data.success){
                        searchStore();
                    }else{
                        alert(data.message)
                    }
                },
                error:function(){
                    alert("错误");
                }
            })

        }

        //刷新页面
        function replace() {
            window.location.href=location;
        }
    </script>
</head>
<body>
<div class="breadcrumb" id="storeVue">
    <a href="../../admin/common/index">首页</a> &raquo; 店铺列表 <span v-html="message"></span>
</div>
<form id="listForm" method="post">
    <input type="hidden" id="type" name="type" value="-1" />
    <input type="hidden" id="status" name="status" value="-1" />
    <input type="hidden" id="isEnabled" name="isEnabled"  />
    <input type="hidden" id="hasExpired" name="hasExpired"  value="-1"/>
    <div class="bar">
        <div class="buttonGroup">
            <a href="javascript:;" class="iconButton" onclick="add()">
                <span class="addIcon">&nbsp;</span>添加
            </a>
            <a href="javascript:;" id="deleteButton" class="iconButton" onclick="del()">
                <span class="deleteIcon">&nbsp;</span>删除
            </a>
            <a href="javascript:replace()" id="refreshButton" class="iconButton">
                <span class="refreshIcon">&nbsp;</span>刷新
            </a>
            <div id="filterMenu" class="dropdownMenu">
                <a href="javascript:;" class="button">
                    店铺筛选<span class="arrow">&nbsp;</span>
                </a>
                <ul class="check">
                    <li name="type" val="1">普通</li>
                    <li name="type" val="2">自营</li>
                    <li class="divider">&nbsp;</li>
                    <li name="status" val="0">等待审核</li>
                    <li name="status" val="1">审核失败</li>
                    <li name="status" val="2">审核通过</li>
                    <li name="status" val="3">开店成功</li>
                    <li class="divider">&nbsp;</li>
                    <li name="isEnabled" val="true">启用</li>
                    <li name="isEnabled" val="false">禁用</li>
                    <li class="divider">&nbsp;</li>
                    <li name="hasExpired" val="true">已过期</li>
                    <li name="hasExpired" val="false">未过期</li>
                </ul>
            </div>
            <div id="pageSizeMenu" class="dropdownMenu">
                <a href="javascript:;" class="button">
                    每页显示<span class="arrow">&nbsp;</span>
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
                <li val="name">名称</li>
                <li val="email">E-mail</li>
                <li val="mobile">手机</li>
            </ul>
        </div>
    </div>
    <table id="listTable" class="list">
        <tr>
            <th class="check">
                <input type="checkbox" id="selectAll" />
            </th>
            <th>
                <a href="javascript:;" class="sort" name="name">名称</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="type">类型</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="business">商家</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="storeRank">店铺等级</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="storeCategory">店铺分类</a>
            </th>
            <th>
                <a href="javascript:;" class="sort"  name="status">状态</a>
            </th>
            <th>
                <a href="javascript:;" class="sort"  name="isEnabled">是否启用</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="createdDate">创建日期</a>
            </th>
            <th>
                <a href="javascript:;" class="sort" name="endDate">到期日期</a>
            </th>
            <th>
                <span>操作</span>
            </th>
        </tr>
        <tr v-for="entity in stores">
            <td><input type="checkbox" :value="entity.store.id" v-model="checkboxIds" ></td>
            <td>{{entity.store.name}}</td>
            <td>{{entity.store.type==1?"普通":"自营"}}</td>
            <td>{{entity.business.username}}</td>
            <td>{{entity.storerank.name}}</td>
            <td>{{entity.storecategory.name}}</td>
            <td>
                <span v-if="entity.store.status==0" class="gray">审核中</span>
                <span v-else-if="entity.store.status==1" class="red">审核失败</span>
                <span v-else-if="entity.store.status==2" class="green">审核成功</span>
                <span v-else-if="entity.store.status==3" class="green">开店成功</span>
            </td>
            <td>
                <span class="green" v-if="entity.store.isenabled==true">启用</span>
                <span class="red" v-else>未启用</span>
            </td>
            <td><span title="entity.store.createddate">{{entity.store.createddate}}</span></td>
            <td><span title="entity.store.enddate">{{entity.store.enddate}}</span></td>
            <td>
                <button type="button" class="btn btn-info btn-lg" @click="editStore(entity.store.id)" >编辑</button>
            </td>
        </tr>
    </table>
    <input type="hidden" id="pageSize" name="pageSize" value="20" v-model="pageSize"/>
    <input type="hidden" id="pageNum" name="pageNum" value="1" v-model="pageNum"/>
    <input type="hidden" id="searchProperty" name="searchProperty" value="" />
    <input type="hidden" id="orderProperty" name="orderProperty" value="" />
    <input type="hidden" id="orderDirection" name="orderDirection" value="" />
    <input type="hidden" id="totalPage" name="totalPage" v-model="totalPage">
</form>
</body>
</html>