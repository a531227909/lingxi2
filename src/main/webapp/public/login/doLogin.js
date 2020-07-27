function doLogin(username,password,verificationCode){
    alert(username);
    $.ajax({
        contentType:"application/json"
        ,type: "POST"
        ,url: "dologin"//接口地址,
        ,dataType:"json"
        ,data: '{"username":"'+username+'"' +
            ',"password":"'+password+'"' +
            ',"verificationCode":"'+verificationCode+'"}'
        ,success:function(data){
            var s = data.datas;
            alert(s.age);
        }
        ,error:function(data){
            alert("服务器异常，操作失败！")
        }
    })
}