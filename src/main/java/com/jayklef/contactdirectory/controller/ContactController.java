package com.jayklef.contactdirectory.controller;

import com.jayklef.contactdirectory.model.Contact;
import com.jayklef.contactdirectory.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String getContacts(Model model){
        List<Contact> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contacts";
    }
    @PostMapping("/save")
    public String saveContact(Contact contact){
        contactService.saveContact(contact);
        return "contact";
    }

}
