package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "sahushoumik23@gmail.com", "Shoumik", 1311L),
            new Contact(3L, "faizan@gmail.com", "Faizan", 1312L),
            new Contact(4L, "yashraj@gmail.com", "Yashraj", 1313L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
