package com.sid.project.EazyByteSchool.Controller;

import com.sid.project.EazyByteSchool.ContactService;
import com.sid.project.EazyByteSchool.Model.ContactInfo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ContactController
{
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService)
    {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactUs()
    {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView createContact(ContactInfo contactInfo)
    {
        contactService.doContact(contactInfo);
        return new ModelAndView("redirect:/contact");
    }
}
