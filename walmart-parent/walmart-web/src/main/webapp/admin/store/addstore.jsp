<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>添加店铺 - Powered By SHOP++</title>
    <meta name="author" content="SHOP++ Team" />
    <meta name="copyright" content="SHOP++" />
    <link href="../../resources/admin/css/selectmultiple.css" rel="stylesheet" type="text/css" />
    <link href="../../resources/admin/css/common.css" rel="stylesheet" type="text/css" />
    <link href="../../resources/admin/css/iview.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../../resources/admin/js/jquery.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/jquery.validate.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/jquery.tools.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/webuploader.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/jquery.selectmultiple.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/common.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/input.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/vue.min.js"></script>
    <script type="text/javascript" src="../../resources/admin/js/iview.min.js"></script>
    <script type="text/javascript">
        addVue = new Vue({
            el:'#inputForm',
            data: {
                store: {
                    storerankId: 1,
                    storecategoryId: 1,
                    type: '',
                    name: '',
                    email: '',
                    zipcode: '',
                    mobile: '',
                    phone: '',
                    address: '',
                    introduction: ''
                }
            }
        });





        //提交表单
        function addStore() {
            $.ajax({
                url:"/store/addStore.do",
                type:"post",
                data:$("#inputForm").serialize(),
                dataType:"json",
                success:function(data){
                    if(data.success){
                        window.location.href="list.jsp";
                    }else{
                        alert("新增失败!")
                    }
                },
                error:function(){
                    alert("错误");
                }
            })
        }

        $(function () {
            //查询店铺等级
            findGrade(1);

            //查询店铺分类
            $.ajax({
                url:"/classify/findclassify.do",
                type:"post",
                dataType:"json",
                success:function(data){
                    var classify="";
                    for (var i = 0; i < data.length; i++) {
                        classify+="<option value='"+data[i].id+"'>"+data[i].name+"</option>";
                    }
                    $("#storecategoryId").html(classify);
                },
                error:function(){
                    alert("错误");
                }
            });

            //查询商家列表
            $.ajax({
                url:"/business/queryBusiness.do",
                type:"post",
                dataType:"json",
                success:function(data){
                    var bus="";
                    for (var i = 0; i < data.length; i++) {
                        bus+="<option value="+data[i].id+">"+data[i].username+"</option>";
                    }
                    $("#businessId").html(bus);
                },
                error:function(){
                    alert("错误");
                }
            })
        });

        function findGrade(a) {
            $.ajax({
                url:"/grade/findGrade.do",
                type:"post",
                data:{isallowregister:a},
                dataType:"json",
                success:function(data){
                    var rank="";
                    for (var i = 0; i < data.length; i++) {
                        rank+="<option value='"+data[i].id+"'>"+data[i].name+"</option>";
                    }
                    $("#storerankId").html(rank);
                },
                error:function(){
                    alert("错误");
                }
            });
        }

    </script>
</head>
<body>
<div class="breadcrumb">
    <a href="../../admin/common/index">首页</a> &raquo; 添加店铺
</div>
<form id="inputForm"  method="post">
    <table class="input">
        <tr>
            <th>
                <span class="requiredField">*</span>商家选择:
            </th>
            <td>
                <select id="businessId" name="businessId">
                    <option value="2">admin</option>
                </select>
            </td>
        </tr>
        <tr class="hidden">
            <th>
                用户名:
            </th>
            <td id="username"></td>
        </tr>
        <tr>
            <th>
                <span class="requiredField">*</span>名称:
            </th>
            <td>
                <input type="text" name="name" class="text" maxlength="200" v-model="store.name"/>
            </td>
        </tr>
        <tr>
            <th>
                类型:
            </th>
            <td>
                <select id="type" name="type" v-model="store.type" onchange="findGrade(this.value)">
                    <option value="true">普通</option>
                    <option value="false">自营</option>
                </select>
            </td>
        </tr>
       <%-- <tr>
            <th>
                logo:
            </th>
            <td>
					<span class="fieldSet">
						<input type="text" name="logo" class="text" maxlength="200" />
						<a href="javascript:;" id="filePicker" class="button">选择文件</a>
					</span>
            </td>
        </tr>--%>
        <tr>
            <th>
                <span class="requiredField">*</span>E-mail:
            </th>
            <td>
                <input type="text" name="email" class="text" maxlength="200" v-model="store.email"/>
            </td>
        </tr>
        <tr>
            <th>
                <span class="requiredField">*</span>手机:
            </th>
            <td>
                <input type="text" name="mobile" class="text" maxlength="200" v-model="store.mobile"/>
            </td>
        </tr>
        <tr>
            <th>
                电话:
            </th>
            <td>
                <input type="text" name="phone" class="text" maxlength="200" v-model="store.phone"/>
            </td>
        </tr>
        <tr>
            <th>
                地址:
            </th>
            <td>
                <input type="text" name="address" class="text" maxlength="200" v-model="store.address"/>
            </td>
        </tr>
        <tr>
            <th>
                邮编:
            </th>
            <td>
                <input type="text" name="zipcode" class="text" maxlength="200" v-model="store.zipcode"/>
            </td>
        </tr>
        <tr>
            <th>
                简介:
            </th>
            <td>
                <textarea name="introduction" class="text" v-model="store.introduction"></textarea>
            </td>
        </tr>
        <tr>
            <th>
                店铺等级:
            </th>
            <td>
                <select name="storerankId" id="storerankId" v-model="store.storerankId" >
                    <option value="1">普通店铺</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>
                店铺分类:
            </th>
            <td>
                <select id="storecategoryId" name="storecategoryId" v-model="store.storecategory">
                    <option value="1">手机数码</option>

                </select>
            </td>
        </tr>
        <tr>
            <th>
                经营分类:
            </th>
            <td>
                <select id="productcategoryIds" name="productcategoryIds" multiple="multiple" v-model="store.productcategoryIds">
                    <option value="1">
                        手机数码
                    </option>
                    <option value="7">
                        &nbsp;&nbsp;
                        手机通讯
                    </option>
                    <option value="41">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手机
                    </option>
                    <option value="42">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        对讲机
                    </option>
                    <option value="8">
                        &nbsp;&nbsp;
                        手机配件
                    </option>
                    <option value="43">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手机电池
                    </option>
                    <option value="44">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        移动电源
                    </option>
                    <option value="45">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        充电器
                    </option>
                    <option value="46">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手机耳机
                    </option>
                    <option value="47">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手机贴膜
                    </option>
                    <option value="48">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手机保护套
                    </option>
                    <option value="9">
                        &nbsp;&nbsp;
                        摄影摄像
                    </option>
                    <option value="49">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        数码相机
                    </option>
                    <option value="50">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        单反相机
                    </option>
                    <option value="51">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        数码摄像机
                    </option>
                    <option value="52">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        拍立得
                    </option>
                    <option value="53">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        镜头
                    </option>
                    <option value="54">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        户外器材
                    </option>
                    <option value="10">
                        &nbsp;&nbsp;
                        数码配件
                    </option>
                    <option value="55">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        存储卡
                    </option>
                    <option value="56">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        读卡器
                    </option>
                    <option value="57">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        数码贴膜
                    </option>
                    <option value="58">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        充电器
                    </option>
                    <option value="59">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        相机包
                    </option>
                    <option value="60">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        滤镜
                    </option>
                    <option value="11">
                        &nbsp;&nbsp;
                        智能设备
                    </option>
                    <option value="61">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        智能手环
                    </option>
                    <option value="62">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        智能手表
                    </option>
                    <option value="63">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        智能眼镜
                    </option>
                    <option value="64">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        智能配饰
                    </option>
                    <option value="65">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        智能家居
                    </option>
                    <option value="66">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        健康监测
                    </option>
                    <option value="12">
                        &nbsp;&nbsp;
                        时尚影音
                    </option>
                    <option value="67">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        MP3/MP4
                    </option>
                    <option value="68">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        收录音机
                    </option>
                    <option value="69">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        数码相框
                    </option>
                    <option value="70">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        耳机耳麦
                    </option>
                    <option value="71">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        录音笔
                    </option>
                    <option value="72">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        音箱
                    </option>
                    <option value="13">
                        &nbsp;&nbsp;
                        电子教育
                    </option>
                    <option value="73">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电子词典
                    </option>
                    <option value="74">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        学生平板
                    </option>
                    <option value="75">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        复读机
                    </option>
                    <option value="76">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        点读机
                    </option>
                    <option value="77">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        早教机
                    </option>
                    <option value="78">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        学习机
                    </option>
                    <option value="2">
                        电脑办公
                    </option>
                    <option value="14">
                        &nbsp;&nbsp;
                        电脑整机
                    </option>
                    <option value="79">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        笔记本
                    </option>
                    <option value="80">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        超极本
                    </option>
                    <option value="81">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        游戏本
                    </option>
                    <option value="82">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        平板电脑
                    </option>
                    <option value="83">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        台式机
                    </option>
                    <option value="84">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        服务器
                    </option>
                    <option value="15">
                        &nbsp;&nbsp;
                        电脑配件
                    </option>
                    <option value="85">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        CPU
                    </option>
                    <option value="86">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        主板
                    </option>
                    <option value="87">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        硬盘
                    </option>
                    <option value="88">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        内存
                    </option>
                    <option value="89">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        机箱
                    </option>
                    <option value="90">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        显示器
                    </option>
                    <option value="16">
                        &nbsp;&nbsp;
                        电脑外设
                    </option>
                    <option value="91">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        移动硬盘
                    </option>
                    <option value="92">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        U盘
                    </option>
                    <option value="93">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        鼠标
                    </option>
                    <option value="94">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        键盘
                    </option>
                    <option value="95">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        摄像头
                    </option>
                    <option value="96">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手写板
                    </option>
                    <option value="17">
                        &nbsp;&nbsp;
                        网络设备
                    </option>
                    <option value="97">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        路由器
                    </option>
                    <option value="98">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        交换机
                    </option>
                    <option value="99">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        网卡
                    </option>
                    <option value="100">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        网络存储
                    </option>
                    <option value="101">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        3G/4G上网
                    </option>
                    <option value="102">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        网络盒子
                    </option>
                    <option value="18">
                        &nbsp;&nbsp;
                        办公打印
                    </option>
                    <option value="103">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        打印机
                    </option>
                    <option value="104">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        扫描仪
                    </option>
                    <option value="105">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        传真机
                    </option>
                    <option value="106">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        一体机
                    </option>
                    <option value="107">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        投影机
                    </option>
                    <option value="108">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        考勤机
                    </option>
                    <option value="19">
                        &nbsp;&nbsp;
                        办公文仪
                    </option>
                    <option value="109">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        办公文具
                    </option>
                    <option value="110">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        办公用纸
                    </option>
                    <option value="111">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        财务用品
                    </option>
                    <option value="112">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        学生文具
                    </option>
                    <option value="113">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        文件管理
                    </option>
                    <option value="114">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        计算器
                    </option>
                    <option value="20">
                        &nbsp;&nbsp;
                        办公耗材
                    </option>
                    <option value="115">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        硒鼓
                    </option>
                    <option value="116">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        墨粉
                    </option>
                    <option value="117">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        墨盒
                    </option>
                    <option value="118">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        色带
                    </option>
                    <option value="119">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        纸类
                    </option>
                    <option value="120">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        刻录光盘
                    </option>
                    <option value="3">
                        家用电器
                    </option>
                    <option value="21">
                        &nbsp;&nbsp;
                        生活电器
                    </option>
                    <option value="121">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电风扇
                    </option>
                    <option value="122">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        吸尘器
                    </option>
                    <option value="123">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        饮水机
                    </option>
                    <option value="124">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        加湿器
                    </option>
                    <option value="125">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        干衣机
                    </option>
                    <option value="126">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电话机
                    </option>
                    <option value="22">
                        &nbsp;&nbsp;
                        厨卫电器
                    </option>
                    <option value="127">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电饭煲
                    </option>
                    <option value="128">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        微波炉
                    </option>
                    <option value="129">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电磁炉
                    </option>
                    <option value="130">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        豆浆机
                    </option>
                    <option value="131">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        榨汁机
                    </option>
                    <option value="132">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        面包机
                    </option>
                    <option value="23">
                        &nbsp;&nbsp;
                        个护健康
                    </option>
                    <option value="133">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        剃须刀
                    </option>
                    <option value="134">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电吹风
                    </option>
                    <option value="135">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        理发器
                    </option>
                    <option value="136">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        体温计
                    </option>
                    <option value="137">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        血压计
                    </option>
                    <option value="138">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        血糖仪
                    </option>
                    <option value="24">
                        &nbsp;&nbsp;
                        五金家装
                    </option>
                    <option value="139">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电动工具
                    </option>
                    <option value="140">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手动工具
                    </option>
                    <option value="141">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        仪器仪表
                    </option>
                    <option value="142">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        淋浴花洒
                    </option>
                    <option value="143">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        厨卫五金
                    </option>
                    <option value="144">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        家具五金
                    </option>
                    <option value="25">
                        &nbsp;&nbsp;
                        大家电
                    </option>
                    <option value="145">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        平板电视
                    </option>
                    <option value="146">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        家庭影院
                    </option>
                    <option value="147">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        洗衣机
                    </option>
                    <option value="148">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        热水器
                    </option>
                    <option value="149">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        冰箱
                    </option>
                    <option value="150">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        空调
                    </option>
                    <option value="4">
                        服装鞋靴
                    </option>
                    <option value="26">
                        &nbsp;&nbsp;
                        品质男装
                    </option>
                    <option value="151">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        衬衫
                    </option>
                    <option value="152">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        T恤
                    </option>
                    <option value="153">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        夹克
                    </option>
                    <option value="154">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        针织衫
                    </option>
                    <option value="155">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        羊绒衫
                    </option>
                    <option value="156">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        羽绒服
                    </option>
                    <option value="27">
                        &nbsp;&nbsp;
                        时尚女装
                    </option>
                    <option value="157">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        衬衫
                    </option>
                    <option value="158">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        T恤
                    </option>
                    <option value="159">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        风衣
                    </option>
                    <option value="160">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        连衣裙
                    </option>
                    <option value="161">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        牛仔裤
                    </option>
                    <option value="162">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        休闲裤
                    </option>
                    <option value="28">
                        &nbsp;&nbsp;
                        精品内衣
                    </option>
                    <option value="163">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        文胸
                    </option>
                    <option value="164">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        女式内裤
                    </option>
                    <option value="165">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        男式内裤
                    </option>
                    <option value="166">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        保暖内衣
                    </option>
                    <option value="167">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        秋衣秋裤
                    </option>
                    <option value="168">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        塑身美体
                    </option>
                    <option value="29">
                        &nbsp;&nbsp;
                        精品男鞋
                    </option>
                    <option value="169">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        正装鞋
                    </option>
                    <option value="170">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        休闲鞋
                    </option>
                    <option value="171">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        运动鞋
                    </option>
                    <option value="172">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        凉鞋
                    </option>
                    <option value="173">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        拖鞋
                    </option>
                    <option value="174">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        男靴
                    </option>
                    <option value="30">
                        &nbsp;&nbsp;
                        潮流女鞋
                    </option>
                    <option value="175">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        高跟鞋
                    </option>
                    <option value="176">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        休闲鞋
                    </option>
                    <option value="177">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        运动鞋
                    </option>
                    <option value="178">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        凉鞋
                    </option>
                    <option value="179">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        拖鞋
                    </option>
                    <option value="180">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        女靴
                    </option>
                    <option value="5">
                        化妆护理
                    </option>
                    <option value="31">
                        &nbsp;&nbsp;
                        面部护肤
                    </option>
                    <option value="181">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        清洁
                    </option>
                    <option value="182">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        护肤
                    </option>
                    <option value="183">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        面膜
                    </option>
                    <option value="184">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        剃须
                    </option>
                    <option value="185">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        化妆水
                    </option>
                    <option value="186">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        套装
                    </option>
                    <option value="32">
                        &nbsp;&nbsp;
                        身体护肤
                    </option>
                    <option value="187">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        沐浴
                    </option>
                    <option value="188">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        润肤
                    </option>
                    <option value="189">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        颈部
                    </option>
                    <option value="190">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        手足
                    </option>
                    <option value="191">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        塑形
                    </option>
                    <option value="192">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        美胸
                    </option>
                    <option value="33">
                        &nbsp;&nbsp;
                        口腔护理
                    </option>
                    <option value="193">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        牙膏
                    </option>
                    <option value="194">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        牙粉
                    </option>
                    <option value="195">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        牙刷
                    </option>
                    <option value="196">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        牙线
                    </option>
                    <option value="197">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        漱口水
                    </option>
                    <option value="198">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        套装
                    </option>
                    <option value="34">
                        &nbsp;&nbsp;
                        洗发护发
                    </option>
                    <option value="199">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        洗发
                    </option>
                    <option value="200">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        护发
                    </option>
                    <option value="201">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        染发
                    </option>
                    <option value="202">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        造型
                    </option>
                    <option value="203">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        假发
                    </option>
                    <option value="204">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        套装
                    </option>
                    <option value="35">
                        &nbsp;&nbsp;
                        香水彩妆
                    </option>
                    <option value="205">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        香水
                    </option>
                    <option value="206">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        底妆
                    </option>
                    <option value="207">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        腮红
                    </option>
                    <option value="208">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        眼部
                    </option>
                    <option value="209">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        唇部
                    </option>
                    <option value="210">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        美甲
                    </option>
                    <option value="6">
                        家居家装
                    </option>
                    <option value="36">
                        &nbsp;&nbsp;
                        家纺布艺
                    </option>
                    <option value="211">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        被子
                    </option>
                    <option value="212">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        毯子
                    </option>
                    <option value="213">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        凉席
                    </option>
                    <option value="214">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        蚊帐
                    </option>
                    <option value="215">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        床垫
                    </option>
                    <option value="216">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        布艺
                    </option>
                    <option value="37">
                        &nbsp;&nbsp;
                        家居照明
                    </option>
                    <option value="217">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        台灯
                    </option>
                    <option value="218">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        吊灯
                    </option>
                    <option value="219">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        壁灯
                    </option>
                    <option value="220">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        射灯
                    </option>
                    <option value="221">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        吸顶灯
                    </option>
                    <option value="222">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        落地灯
                    </option>
                    <option value="38">
                        &nbsp;&nbsp;
                        家装建材
                    </option>
                    <option value="223">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        开关
                    </option>
                    <option value="224">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        插座
                    </option>
                    <option value="225">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电线
                    </option>
                    <option value="226">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        转换插头
                    </option>
                    <option value="227">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        电工电料
                    </option>
                    <option value="228">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        监控安防
                    </option>
                    <option value="39">
                        &nbsp;&nbsp;
                        生活日用
                    </option>
                    <option value="229">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        收纳用品
                    </option>
                    <option value="230">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        晴雨用具
                    </option>
                    <option value="231">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        浴室用品
                    </option>
                    <option value="232">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        针织用品
                    </option>
                    <option value="233">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        净化除味
                    </option>
                    <option value="234">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        驱蚊驱虫
                    </option>
                    <option value="40">
                        &nbsp;&nbsp;
                        清洁用品
                    </option>
                    <option value="235">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        纸品湿巾
                    </option>
                    <option value="236">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        衣物洗护
                    </option>
                    <option value="237">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        皮具护理
                    </option>
                    <option value="238">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        居家清洁
                    </option>
                    <option value="239">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        清洁工具
                    </option>
                    <option value="240">
                        &nbsp;&nbsp;
                        &nbsp;&nbsp;
                        驱虫用品
                    </option>
                    <option value="241">
                        积分商城
                    </option>
                </select>
            </td>
        </tr>
        <tr>
            <th>
                设置:
            </th>
            <td>
                <label>
                    <input type="radio" name="isenabled" value="true" checked="checked" />是否启用
                    <input type="radio" name="isenabled" value="false" />
                </label>
            </td>
        </tr>
        <tr>
            <th>
                &nbsp;
            </th>
            <td>
                <input type="button" class="button" value="确 定" onclick="addStore()"/>
                <input type="button" class="button" value="返 回" onclick="history.back(); return false;" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>