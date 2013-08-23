package model.service;

import java.util.List;


import model.dao.ContactDAO;
import model.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ContactServiceImpl implements ContactService {

 @Autowired
 private ContactDAO contactDAO;

 @Transactional
 public void addContact(Contact contact) {
 contactDAO.addContact(contact);
 }

 @Transactional
 public List<Contact> listContact() {

 return contactDAO.listContact();
 }

 @Transactional
 public void removeContact(Integer id) {
 contactDAO.removeContact(id);
 }
}