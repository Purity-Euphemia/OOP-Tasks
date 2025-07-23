package DSA;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public void removeContact(String phoneNumber) {
        Contact toRemove = findByPhoneNumber(phoneNumber);
        if (toRemove != null) {
            contacts.remove(toRemove);
        }
    }
    public Contact findByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
    public List<Contact> findByFirstName(String firstName) {
        List<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }
    public List<Contact> findByLastName(String lastName) {
        List<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }
    public void editContact(String phoneNumber, Contact contact) {
        Contact foundContact = findByPhoneNumber(phoneNumber);
        if (foundContact != null) {
            foundContact.setFirstName(contact.getFirstName());
            foundContact.setLastName(contact.getLastName());
            foundContact.setPhoneNumber(contact.getPhoneNumber());
        }
        else {
            System.out.println("No such contact");
        }

    }
    public List<Contact> getAllContacts() {
        return contacts;
    }

}
