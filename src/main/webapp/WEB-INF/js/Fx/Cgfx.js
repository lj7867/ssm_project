var table,form,layer;
$(function(){
    layui.use(['table','form','layer'], function() {
        table = layui.table;
        form =layui.form;
        layer=layui.layer;
        initData();
    });

    $("#add").click(function(){
        layer.open({
            id:'1',
            title:'添加常规费项',
            area: ['650px', '500px'],
            type:2,
            content:'/fx/toAddfx'
        });
    });

});

function initData(){
    table.render({
        elem: '#test'
        ,url:''
        ,cols: [[
            {field:'id', width:80, title: 'ID', sort: true}
            ,{field:'username', width:80, title: '用户名'}
            ,{field:'sex', width:80, title: '性别', sort: true}
            ,{field:'city', width:80, title: '城市'}
            ,{field:'sign', title: '签名', minWidth: 150}
            ,{field:'experience', width:80, title: '积分', sort: true}
            ,{field:'score', width:80, title: '评分', sort: true}
            ,{field:'classify', width:80, title: '职业'}
            ,{field:'wealth', width:135, title: '财富', sort: true}
        ]]
        ,page: true
    });
}