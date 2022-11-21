package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list=List.of(new Contact(1L,"mhatreom31@gmail.com" , "Omkar", 1311L),
								new Contact(2L,"mhatreokar165@gmail.com" , "zuge", 1311L),
								new Contact(3L,"prathamaeshz@gmail.com" , "pratham", 1312L),
								new Contact(4L,"sameer@gmail.com" , "sameer", 1314L));
	
	
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
