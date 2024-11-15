package com.sid.project.EazyByteSchool.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController
{

    private final Logger log = LoggerFactory.getLogger(ContactController.class);
    @GetMapping("/contact")
    public String displayContactUs()
    {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView createContact(@RequestParam String name, @RequestParam String mobileNum,
                                      @RequestParam String email, @RequestParam String subject, @RequestParam String message)
    {
        log.info(name);
        log.info(mobileNum);
        log.info(subject);
        log.info(message);
        log.info(email);
        return new ModelAndView("redirect:/contact");
    }
}
