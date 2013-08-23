package model.dao;

import java.util.List;


import model.entities.Contact;
public interface ContactDAO {
public void addContact(Contact contact);
 public List<Contact> listContact();
 public void removeContact(Integer id);
}
