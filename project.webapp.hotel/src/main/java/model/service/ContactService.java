package model.service;

import java.util.List;



import model.entities.Contact;

public interface ContactService {

 public void addContact(Contact contact);
 public List<Contact> listContact();
 public void removeContact(Integer id);
}