package com.sid.project.EazyByteSchool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/home")
    public String homeMethod()
    {
        return "home.html";
    }
}