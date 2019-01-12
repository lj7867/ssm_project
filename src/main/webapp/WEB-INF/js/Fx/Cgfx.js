var table,form,layer,where;
$(function(){
    layui.use(['table','form','layer'], function() {
        table = layui.table;
        form =layui.form;
        layer=layui.layer;
        where={};
        initData(where);
        initDict();

        form.on('select(aihao)', function(data){
            var value=data.value;
            if('0'==value){
                value="";
            }
            alert(value);
            where={"costToll":value};
            initData(where);
        });
        table.on('tool(tb)', function(obj) {
            var data = obj.data;
            //console.log(data);
            if (obj.event === 'fp') {
                sessionStorage.setItem("id",data.cost_id);
                layer.open({
                    id:'1',
                    title:'费项设置',
                    area: ['650px', '500px'],
                    type:2,
                    content:'fx/toSetfx',
                    success:function(layero,index){
                        var body = layer.getChildFrame('body', index);
                        var iframeWin = window[layero.find('iframe')[0]['name']];
                        body.find("#costId").val(data.cost_id);
                        //body.find("#costName").val(data.cost_name);
                    }
                });
            }

        });

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

function initData(where){
    table.render({
        elem: '#test'
        ,id:"idTest"
        ,where:where
        ,url:'fx/queryCostPage'
        ,cols: [[
            {field:'cost_name',  title: '费项名称',templet:function(d){
                return "<a lay-event=\"fp\" style=\"color: blue\">"+d.cost_name+"</a>";
                }}
            ,{field:'costToll',  title: '收费方式'}
            ,{field:'cost_money',  title: '单位价格', sort: true}
            ,{field:'cost_stair',  title: '阶梯收费',templet:function(value){
                if(value.cost_stair==null ||0==value.cost_stair.length || value.cost_stair!="jt"){
                    return "否";
                }else{
                    return "是";
                }
                }}
            ,{field:'cost_period', title: '收费周期'}
            ,{field:'cost_rate',  title: '滞纳金比率%', sort: true}
            ,{field:'cost_exceed',  title: '超期天数', sort: true}
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
            //给下拉赋默认值
            //$("#sf").val("zh");
            form.render('select');
        }
    });
}