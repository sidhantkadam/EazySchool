package com.sid.project.EazyByteSchool.Controller;

import com.sid.project.EazyByteSchool.ContactService;
import com.sid.project.EazyByteSchool.Model.ContactInfo;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/contact")
    public String displayContactUs(Model model)
    {
        model.addAttribute("contact", new ContactInfo());
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public String createContact(@Valid @ModelAttribute("contact") ContactInfo contactInfo, Errors errors)
    {
        if(errors.hasErrors())
        {
            log.error("Contact form validation failed due to : "+ errors.toString());
            return "contact.html";
        }
        contactService.doContact(contactInfo);
        return "redirect:/contact";
    }
}
