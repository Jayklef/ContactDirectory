package com.jayklef.contactdirectory.controller;

import com.jayklef.contactdirectory.model.Contact;
import com.jayklef.contactdirectory.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public String getContacts(Model model){
        List<Contact> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contacts";
    }

    @GetMapping("addContactForm")
    public String saveContact(Model model){
        model.addAttribute("contact", new Contact());
        return "contact-form";
    }


    @PostMapping("/saveContact")
    public String saveContact(Contact contact, RedirectAttributes attributes){
        String saveInfo = "Contact saved successfully";
        contactService.saveContact(contact);
        attributes.addFlashAttribute("message", saveInfo);
        return "redirect:/contacts";
    }

    @GetMapping("/editContactForm")
    public String updateContact(@RequestParam Long contactId, Model model){
        model.addAttribute("contact", new Contact());
        contactService.updateContact(contactId);
        return "contact-form";
    }

}
