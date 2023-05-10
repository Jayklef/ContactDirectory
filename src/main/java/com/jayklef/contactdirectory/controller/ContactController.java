package com.jayklef.contactdirectory.controller;

import com.jayklef.contactdirectory.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;
}
