function doLogin(username,password,verificationCode){
    alert(username);
    $.ajax({
        type: "POST"
        ,url: "dologin"//接口地址,
        ,dataType:"json"
        ,data: 'user_id=1&password=123456'
        ,success:function(data){
            var s = data.datas;
            alert(s.password);
        }
        ,error:function(data){
            alert("服务器异常，操作失败！")
        }
    })
}