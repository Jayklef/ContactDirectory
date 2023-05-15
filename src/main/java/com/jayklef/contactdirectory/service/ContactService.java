package com.jayklef.contactdirectory.service;

import com.jayklef.contactdirectory.model.Contact;

import java.util.List;

public interface ContactService {


    List<Contact> getAllContacts();

    void saveContact(Contact contact);

    void updateContact(Long contactId);
}
