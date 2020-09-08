//package com.labour.filter;
//
//import com.labour.entity.Result;
//import com.labour.utils.TokenUtils;
//import net.sf.json.JSONObject;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;
//
//@WebFilter(filterName = "loginFilter", urlPatterns = "/*")
//public class IndexFilter implements Filter {
//
//	private static Logger logger = LogManager.getLogger("org.springframework");
//
//	@Override
//	public void destroy() {
//
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse rep = (HttpServletResponse) response;
//
//        //设置允许跨域的配置
//        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
//        rep.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
//        // 允许的访问方法
//        rep.setHeader("Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS, DELETE, PATCH");
//        // Access-Control-Max-Age 用于 CORS 相关配置的缓存
//        rep.setHeader("Access-Control-Max-Age", "3600");
//        rep.setHeader("Access-Control-Allow-Credentials", "true");
//        rep.setHeader("XDomainRequestAllowed","1");
//        rep.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
//        rep.setHeader("Access-Control-Allow-Methods", "*");
//        rep.setHeader("Access-Control-Allow-Headers", "Authorization,Origin, X-Requested-With, Content-Type, Accept,Access-Token, token");
//
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json; charset=utf-8");
//        String token = req.getHeader("token");//header方式
//		Result resultInfo = new Result();
//        chain.doFilter(request, response);
////        boolean isFilter = false;
////
////        String url=req.getRequestURI();
////
////        if("/".equals(url)){
////            chain.doFilter(req, rep);
////            return;
////        }else{
////            //*********************************************//
////            //**************不需要拦截路径**********************//
////            //*********************************************//
////            String NoFilter_Pages[]={"dologin",".css",".js",".png",".jpg",".gif",".bmp",".eto",".svg",".ttf",".woff",".woff2",".ico",
////                    "getVerifycode","/login.html"};
////            for (int i = 0; i < NoFilter_Pages.length; i++) {
////                if (url.indexOf(NoFilter_Pages[i]) > -1) {
////                    chain.doFilter(req, rep);
////                    return;
////                }
////            }
////        }
////
////        String method = ((HttpServletRequest) request).getMethod();
////        if (method.equals("OPTIONS")) {
////            rep.setStatus(HttpServletResponse.SC_OK);
////        }else{
////            if (null == token || token.isEmpty()) {
////                resultInfo.setCode("401");
////                resultInfo.setMsg("用户授权认证没有通过!无token信息,请登录后获取token");
////            } else {
////                boolean tokenStatus = false;
////                tokenStatus = TokenUtils.verify(token);
////                if(tokenStatus == false){
////                    resultInfo.setCode("401");
////                    resultInfo.setMsg("用户授权认证没有通过!token信息无效");
////                }else{
////                    resultInfo.setCode("1000");
////                    resultInfo.setMsg("用户授权认证通过!");
////                    isFilter = true;
////                }
////            }
////            if (resultInfo.getCode().equals("401")) {// 验证失败
////                PrintWriter writer = null;
////                OutputStreamWriter osw = null;
////                try {
////                    osw = new OutputStreamWriter(response.getOutputStream(),
////                            "UTF-8");
////                    writer = new PrintWriter(osw, true);
////                    String jsonStr = JSONObject.fromObject(resultInfo).toString();
////                    writer.write(jsonStr);
////                    writer.flush();
////                    writer.close();
////                    osw.close();
////                } catch (UnsupportedEncodingException e) {
////                    logger.error("过滤器返回信息失败:" + e.getMessage(), e);
////                } catch (IOException e) {
////                    logger.error("过滤器返回信息失败:" + e.getMessage(), e);
////                } finally {
////                    if (null != writer) {
////                        writer.close();
////                    }
////                    if (null != osw) {
////                        osw.close();
////                    }
////                }
////                return;
////            }
////            if (isFilter) {
////                chain.doFilter(request, response);
////            }
////        }
//	}
//
//	@Override
//	public void init(FilterConfig arg0) throws ServletException {
//	}
//}