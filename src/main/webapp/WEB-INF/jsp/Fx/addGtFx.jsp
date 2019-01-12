
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加公摊费项</title>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/Fx/addGtFx.js"></script>
</head>
<body>
    <form method="post" action="javascript:addCgfx()" class="layui-form" lay-filter="f" id="f">
        <div class="layui-form">
            <table class="layui-table">
                <tr>
                    <td><font color="red" size="5">*</font>费项名称:</td>
                    <td>
                        <input type="text" class="layui-input" name="costName">
                        <input type="hidden" class="layui-input" name="costWay" value="gt">
                    </td>
                </tr>
                <tr >
                    <td><font color="red" size="5">*</font>收费方式:</td>
                    <td>按
                        <div class="layui-input-block" style="width: 150px;margin-left: 17px;margin-top: -25px">
                            <select name="costToll" lay-filter="aihao" id="sf">
                            </select>
                        </div>
                        <div style="margin-left: 180px;margin-top: -30px;width: 50px;">，每隔</div>
                            <div class="layui-input-block" style="width: 100px;margin-top: -28px;margin-left: 225px">
                            <select name="costPeriod" id="costPeriod"  disabled="disabled" >
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                        </div>
                        <div style="margin-left: 335px;margin-top: -30px;width: 100px;height: 30px">月收取一次。</div>
                    </td>
                </tr>
                <tbody id="zs" style="display: none">
                    <tr id="g">
                        <td><font color="red" size="5">*</font>最少使用量:</td>
                        <td>
                                <div style="width: 100px">
                                    <input type="text" name="zssyl" value="0" class="layui-input" width="50px">
                                </div>
                                <div style="margin-left: 120px;margin-top: -36px">
                                    <input type="radio" lay-filter="r" name="jg" value="dj" title="按单价收取" checked="">
                                    <input type="radio" lay-filter="r" name="jg" value="jt" title="按阶梯价收取">
                                    <input type="hidden" name="costStair" value="dj" id="jsfs"/>
                                </div>
                        </td>
                    </tr>
                </tbody>
                <tr id="jt" style="display: none">
                    <td>阶梯价格</td>
                    <td>
                        <div class="layui-form-item" style="height: 23px">
                            <div class="layui-inline">
                                <label class="layui-form-label">1.使用量<=</label>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="la" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">时，单价</div>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="laa" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">元</div>
                            </div>
                        </div>

                        <div class="layui-form-item" style="height: 23px">
                            <div class="layui-inline">
                                <label class="layui-form-label">2.使用量>=</label>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="lb" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">时，单价</div>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="lbb" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">元</div>
                            </div>
                        </div>

                        <div class="layui-form-item" style="height: 23px">
                            <div class="layui-inline">
                                <label class="layui-form-label">3.使用量>=</label>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="lc" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">时，单价</div>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="lcc" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">元</div>
                            </div>
                        </div>

                        <div class="layui-form-item" style="height: 23px">
                            <div class="layui-inline">
                                <label class="layui-form-label">4.使用量>=</label>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="ld" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">时，单价</div>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="ldd" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">元</div>
                            </div>
                        </div>
                        <div class="layui-form-item" style="height: 23px">
                            <div class="layui-inline">
                                <label class="layui-form-label">5.使用量>=</label>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="le" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">时，单价</div>
                                <div class="layui-input-inline" style="width: 100px;">
                                    <input type="text" name="lee" placeholder="￥" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">元</div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td><font color="red" size="5">*</font>单位价格:</td>
                    <td>
                        <div style="width: 150px">
                            <input type="text" name="costMoney"  class="layui-input">
                        </div>
                        <div style="margin-left: 155px;margin-top: -25px">
                            元
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>滞留金比率:</td>
                    <td>
                        <div style="width: 120px;">
                            <input type="text" placeholder="0" name="costRate" class="layui-input">
                        </div>
                        <div style="margin-left: 130px;margin-top: -30px">
                            (%),超期
                        </div>
                        <div style="width: 120px;margin-left: 210px;margin-top: -30px">
                            <input type="text" name="costExceed" class="layui-input">
                        </div>
                        <div style="width: 120px;margin-left: 335px;margin-top: -30px;height: 32px">
                            天后收取。
                        </div>
                    </td>
                </tr>
                <tr align="center">
                    <td colspan="2">
                        <button class="layui-btn layui-btn-normal" id="sub" ><i class="layui-icon">&#xe605;</i>保存</button>
                        <button class="layui-btn layui-btn-danger" id="close"><i class="layui-icon">&#x1006;</i>关闭</button>
                    </td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
