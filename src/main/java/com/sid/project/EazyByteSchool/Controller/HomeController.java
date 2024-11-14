package com.sid.project.EazyByteSchool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping(value ={"","/","/home"})
    public String homeMethod()
    {
        return "home.html";
    }
}
