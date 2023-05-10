package com.jayklef.contactdirectory.controller;

import com.jayklef.contactdirectory.model.Contacts;
import com.jayklef.contactdirectory.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping()
    public String getContacts(Model model){
        List<Contacts> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contacts";
    }

}
