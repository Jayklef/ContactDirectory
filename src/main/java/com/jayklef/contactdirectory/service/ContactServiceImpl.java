package com.jayklef.contactdirectory.service;

import com.jayklef.contactdirectory.model.Contacts;
import com.jayklef.contactdirectory.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contacts> getAllContacts() {
        return contactRepository.findAll();
    }
}
