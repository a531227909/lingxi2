package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.TestService;
import com.labour.utils.VerificationCodeUtils;
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
import java.util.HashMap;
import java.util.Map;

@Controller
public class DoLoginController {

    @Resource
    private TestService testService;

    @RequestMapping(value="/dologin",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
//    public Result login(@RequestBody String account_id){
//        System.out.println(account_id);
//        Result result = new Result();
//        result = testService.testdoLogin(account_id);
//        return result;
//    }
    public Result login(@RequestBody HashMap<String, String> map, HttpServletRequest req){
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        System.out.println(map.get("verificationCode"));
        System.out.println(req.getSession().getAttribute("verificationCode"));
        String account_id = map.get("account_id");
        Result result = new Result();
        result = testService.testdoLogin(map.get("account_id"));
        return result;
    }

    @RequestMapping(value="/getVerification")
    @ResponseBody
    public void getVerification(HttpServletRequest req, HttpServletResponse resp){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = VerificationCodeUtils.generateCodeAndPic();

        // 将四位数字的验证码保存到Session中。
        HttpSession session = req.getSession();
        session.setAttribute("verificationCode", codeMap.get("code").toString());

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

}
