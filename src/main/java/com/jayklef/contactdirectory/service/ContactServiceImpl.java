package com.jayklef.contactdirectory.service;

import com.jayklef.contactdirectory.model.Contact;
import com.jayklef.contactdirectory.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Long contactId) {
        Contact contactInDb = contactRepository.findById(contactId).get();

/*       if (Objects.nonNull(contact.getFirstname()) &&
       !"".equalsIgnoreCase(String.valueOf(contact.getFirstname()))){
           contactInDb.setFirstname(contact.getFirstname());
       }

       if (Objects.nonNull(contact.getLastname())&&
       !"".equalsIgnoreCase(contact.getLastname())){
           contactInDb.setLastname(contact.getLastname());
       }  */


       contactRepository.save(contactInDb);
        return contactInDb;
    }
}
