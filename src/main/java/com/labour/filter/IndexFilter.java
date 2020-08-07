package com.labour.filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "loginFilter", urlPatterns = "/*")
public class IndexFilter implements Filter {
	
	private static Logger logger = LogManager.getLogger("org.springframework");
	
	@Override
	public void destroy() {
		  
	}
  
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;

        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
        rep.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        // 允许的访问方法
        rep.setHeader("Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS, DELETE, PATCH");
        // Access-Control-Max-Age 用于 CORS 相关配置的缓存
        rep.setHeader("Access-Control-Max-Age", "3600");
        rep.setHeader("Access-Control-Allow-Headers","token,Origin, X-Requested-With, Content-Type, Accept, token");
        rep.setHeader("Access-Control-Allow-Credentials", "true");
        rep.setHeader("XDomainRequestAllowed","1");
        
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        String token = req.getHeader("token");//header方式
        boolean isFilter = false;
        
	    String url=req.getRequestURI();

        System.out.println("url:"+url);
	    
		if("/".equals(url)){
			chain.doFilter(req, rep); 
			return;
		}else{
		     //*********************************************//
		    //**************不需要拦截路径**********************//
		   //*********************************************//
			String NoFilter_Pages[]={"dologin",".css",".js",".png",".jpg",".gif",".bmp",".eto",".svg",".ttf",".woff",".woff2",".ico",
					"getVerification","/login.html"};
			for (int i = 0; i < NoFilter_Pages.length; i++) {
				if (url.indexOf(NoFilter_Pages[i]) > -1) {
					chain.doFilter(req, rep); 
					return;
				}
			}
		}
        
        String method = ((HttpServletRequest) request).getMethod();
        if (method.equals("OPTIONS")) {
            rep.setStatus(HttpServletResponse.SC_OK);
        }else{
        }
	}
  
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init...");
	}
}