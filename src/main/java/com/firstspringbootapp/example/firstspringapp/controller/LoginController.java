package com.firstspringbootapp.example.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.firstspringbootapp.example.firstspringapp.service.authenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {
    
    //private Logger logger = LoggerFactory.getLogger(getClass());
    private authenticationService authService;
    
    
    public LoginController(authenticationService authService) {
        super();
        this.authService= authService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    //@ResponseBody
    //public String loginPage(@RequestParam (name="name", required=false, defaultValue="World") String name, ModelMap model)
    public String loginPage()
    {
        // System.out.println(name);
        // model.addAttribute("name", name);
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    //@ResponseBody
    //public String loginPage(@RequestParam (name="name", required=false, defaultValue="World") String name, ModelMap model)
    public String gotoDashboard(@RequestParam String name, @RequestParam String key,ModelMap model)
    {
        //model.put("name",name);
        model.addAttribute("name",name);
        model.addAttribute("key",key);
        return "Dashboard";
    }
    
    @RequestMapping("dashboard")
    //@ResponseBody
    public String DashboardPage()
    {
        return "Dashboard";
    }

    @RequestMapping("logout")
    //@ResponseBody
    public String logoutPage()
    {
        return "logout";
    }

    @RequestMapping("todo")
    //@ResponseBody
    public String todoPage()
    {
        return "todo";
    }
}
