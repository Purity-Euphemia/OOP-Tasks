package DSA;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public void removeContact(Contact contact) {
        contacts.remove(contact);
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
            if (contact.getFirstName().equals(firstName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }
    public List<Contact> findByLastName(String lastName) {
        List<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
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
        }
        else {
            System.out.println("No such contact");
        }

    }
    public List<Contact> getAllContacts() {
        return contacts;
    }

}
