package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Pattern;
import org.hibernate.validator.Size;

@Entity
@Table(name="CONTACTS")
public class Contact {

 @Id
 @Column(name="ID")
 @GeneratedValue
 private Integer id;

 @Column(name="FIRSTNAME")
 private String firstname;

 @Column(name="LASTNAME")
 private String lastname;

 @Column(name="EMAIL")
 @NotNull
 @Size(min = 1, max = 25)
 @Pattern(regex = "[A-Za-z ]*", message = "must contain only letters and spaces")
 private String email;

 @Column(name="TELEPHONE")
 private String telephone;

 public String getEmail() {
 return email;
 }
 public String getTelephone() {
 return telephone;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public void setTelephone(String telephone) {
 this.telephone = telephone;
 }
 public String getFirstname() {
 return firstname;
 }
 public String getLastname() {
 return lastname;
 }
 public void setFirstname(String firstname) {
 this.firstname = firstname;
 }
 public void setLastname(String lastname) {
 this.lastname = lastname;
 }
 public Integer getId() {
 return id;
 }
 public void setId(Integer id) {
 this.id = id;
 }
}