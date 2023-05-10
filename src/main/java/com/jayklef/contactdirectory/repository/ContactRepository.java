package com.jayklef.contactdirectory.repository;

import com.jayklef.contactdirectory.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long> {
}
