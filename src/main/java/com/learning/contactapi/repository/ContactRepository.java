package com.learning.contactapi.repository;

import com.learning.contactapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, String> {

    Optional<Contact> findById(String id);

}
