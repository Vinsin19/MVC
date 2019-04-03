package com.javatpoint;  
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;  
@Controller  
public class Welcome {  
@RequestMapping("/welcome")  
    public ModelAndView display(HttpServletRequest request,HttpServletResponse response)  
    {  
     
	String name = request.getParameter("usrnme");
    int i = Integer.parseInt(request.getParameter("n1"));
    int j = Integer.parseInt(request.getParameter("n2"));
    int k = i+j ;
    
    ModelAndView mv = new ModelAndView();
    mv.setViewName("huser.jsp");
    mv.addObject("name",name);
    mv.addObject("result",k);
	return mv;  
    }     
} 