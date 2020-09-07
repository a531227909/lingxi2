package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.LoginService;
import com.labour.utils.HttpRequestUtils;
import com.labour.utils.VerificationCodeUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

@Controller
public class DoLoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value="/dologin")
    @ResponseBody
    public Result login(HttpServletRequest req, String user_name, String password, String verifycode){
        Result result = new Result();
        if(StringUtils.isBlank(user_name)){
            result.setCode("1001");
            result.setMsg("用户名不能为空");
            return result;
        }else if(StringUtils.isBlank(password)){
            result.setCode("1001");
            result.setMsg("密码不能为空");
            return result;
        }else if(StringUtils.isBlank(verifycode)){
            result.setCode("1001");
            result.setMsg("验证码不能为空");
            return result;
        }
//        String key = (String) req.getSession().getAttribute("verifycode");
//        if(verifycode.equalsIgnoreCase(key)){
//            req.getSession().removeAttribute("verifycode");
            //获取登录的IP地址
            String ip = HttpRequestUtils.getIp2(req);
            result = loginService.doLogin(user_name, password, ip);
//        }else{
//            result.setCode("1001");
//            result.setMsg("验证码错误");
//        }
        return result;
    }

    @RequestMapping(value="/getVerifycode")
    @ResponseBody
    public void getVerification(HttpServletRequest req, HttpServletResponse resp){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = VerificationCodeUtils.generateCodeAndPic();

        // 将四位数字的验证码保存到Session中。
        HttpSession session = req.getSession();
        session.setAttribute("verifycode", codeMap.get("code").toString());

        // 禁止图像缓存。
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", -1);

        resp.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos;
        try {
            sos = resp.getOutputStream();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
            sos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/selectAllUser")
    @ResponseBody
    public Result selectAllUser(String data){
        Result result = new Result();
        result = loginService.selectAllUser(data);
        return result;
    }

}
