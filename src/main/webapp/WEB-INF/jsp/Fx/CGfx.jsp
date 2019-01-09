
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常规费项设置</title>
    <%@ include file="/common/head.jsp"%>
    <script type="text/javascript" src="/js/Fx/Cgfx.js"></script>
</head>
<body>
    <div class="layui-form" style="margin-left: -30px;margin-top: 5px">
        <label class="layui-form-label">收费方式:</label>
        <div class="layui-input-block" style="width: 150px">
            <select name="interest" lay-filter="aihao">
                <option value="0">写作</option>
                <option value="1">阅读</option>
                <option value="2">游戏</option>
                <option value="3">音乐</option>
                <option value="4">旅行</option>
            </select>
        </div>
    </div>
    <div style="margin-left: 1000px;margin-top: -40px">
        <button class="layui-btn layui-btn-normal" id="add">
            <i class="layui-icon">&#xe654;</i>添加常规费项
        </button>
    </div>


    <table class="layui-hide" id="test"></table>

</body>
</html>
