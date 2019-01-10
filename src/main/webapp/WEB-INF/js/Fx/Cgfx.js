var table,form,layer;
$(function(){
    layui.use(['table','form','layer'], function() {
        table = layui.table;
        form =layui.form;
        layer=layui.layer;
        initData();
        initDict();
    });

    $("#add").click(function(){
        layer.open({
            id:'1',
            title:'添加常规费项',
            area: ['650px', '500px'],
            type:2,
            content:'fx/toAddfx'
        });
    });

});

function initData(){
    table.render({
        elem: '#test'
        ,url:'fx/queryCostPage'
        ,cols: [[
            {field:'costName', width:80, title: '费项名称', sort: true}
            ,{field:'costToll', width:80, title: '收费方式'}
            ,{field:'costMoney', width:80, title: '单位价格', sort: true}
            ,{field:'costStair', width:80, title: '计费方式'}
            ,{field:'costPeriod', title: '收费周期', minWidth: 150}
            ,{field:'costRate', width:80, title: '滞纳金比率', sort: true}
            ,{field:'costExceed', width:80, title: '超期天数', sort: true}
        ]]
        ,page: true
    });
}
function initDict() {
    $.ajax({
        url:"dict/queryDict",
        data:{"dictType":"FX"},
        dataType:"json",
        type:"post",
        async:true,
        success:function(data){
            var optionType = "<option value=\"0\">请选择收费方式</option>";
            $.each(data, function(i, x) {
                optionType += "<option value='" + x.dictValue + "'>"
                    + x.dictItem + "</option>"
            });
            $("select[name=interest]").html(optionType);
            form.render('select');
        }
    });
}