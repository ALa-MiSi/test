package com.gtl.handler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeHandler implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //设置响应中的模型
        mv.addObject("message","Hello SpringMVC!");
        //设置响应视图
        mv.setViewName("/WEB-INF/welcom.jsp");
        return null;
    }
}
