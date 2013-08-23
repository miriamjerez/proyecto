package controller;
import model.entities.Contact;
import model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.persistence.Entity;

@Controller
public class ContactController {
@Autowired
 private ContactService contactService;
@RequestMapping("/index")
 public String listContacts(Model model) {
model.addAttribute("contact", new Contact());
model.addAttribute("contactList", contactService.listContact());
return "contact";
 }
@RequestMapping(value = "/add", method = RequestMethod.POST)
 public String addContact(@ModelAttribute("contact")
 Contact contact, BindingResult result) {
contactService.addContact(contact);
return "redirect:/index";
 }
@RequestMapping("/delete/{contactId}")
 public String deleteContact(@PathVariable("contactId")
 Integer contactId) {
contactService.removeContact(contactId);
return "redirect:/index";
 }
}
