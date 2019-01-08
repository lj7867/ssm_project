package com.zking.ssm.base;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class BaseExceptionHandler implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        if (e instanceof NullPointerException){
            mv.setViewName("404");
            return mv;
        }else if(e instanceof SQLException){
            return mv;
        }
        return null;
    }

}
