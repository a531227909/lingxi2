$(function(){
        $.ajaxSetup({ //发送请求前触发
            beforeSend: function(xhr) { //可以设置自定义标头
                xhr.setRequestHeader('token', localStorage.getItem("lingxi_token"));
            }
        })
});

function doLogin(username,password,verifycode){
    $.ajax({
        type: "POST",
        url: "http://124.71.107.164:8080/dologin",//接口地址
        dataType:"json",
        data: 'user_name='+username+'&password='+password+'&verifycode='+verifycode,
        success:function(data){
            alert(data);
            localStorage.setItem("lingxi_token", token);
            window.location.href="index.html";
        },
        error:function(data){
            alert("服务器异常，操作失败！")
        }
    })
}

function test007(){
    $.ajax({
        type: "POST",
        url: "test007",//接口地址,
        dataType:"json",
        data: 'user_id=1&password=123456',
        success:function(data){
            alert(data.msg);
        },
        error:function(data){
            alert("服务器异常，操作失败！")
        }
    })
}