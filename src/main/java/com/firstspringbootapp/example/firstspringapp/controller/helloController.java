package com.firstspringbootapp.example.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class helloController {

    @RequestMapping("helloworld")
    @ResponseBody
    public String HelloWorld(){
        return "Hello World!!!";
    }

    @RequestMapping("hellohtmlpage")
    @ResponseBody
    public String HelloHtmlPage(){
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Page Head</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Page Body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("hellopage")
    //@ResponseBody
    public String HelloPage(){
        return "hellohtml";
    }
}
