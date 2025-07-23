package DSA;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    @Test
    public void testAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);
        assertEquals(1, phoneBook.getAllContacts().size());
    }

    @Test
    public void testAddSecondContact() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = new Contact("Ayo", "Ade", "08012345678");
        Contact contact2 = new Contact("Ada", "Obi", "09012345678");
        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        assertEquals(2, phoneBook.getAllContacts().size());
    }

    @Test
    public void testRemoveContact() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = new Contact("Ayo", "Ade", "08012345678");
        Contact contact2 = new Contact("Ada", "Obi", "09012345678");
        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.removeContact(contact1.getPhoneNumber());
        assertEquals(1, phoneBook.getAllContacts().size());
    }

    @Test
    public void testThatICanFindContactWithPhoneNumber() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ada", "Obi", "09012345678");
        phoneBook.addContact(contact);
        Contact result = phoneBook.findByPhoneNumber("09012345678");
        assertEquals(contact, result);
        assertEquals("Ada", result.getFirstName());
    }

    @Test
    public void testFindByFirstName() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);
        List<Contact> result = phoneBook.findByFirstName("Ayo");
        assertEquals(1, result.size());
        assertEquals("Ayo", result.get(0).getFirstName());
    }
    @Test
    public void testFindByLastName() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);
        List<Contact> result = phoneBook.findByLastName("Ade");
        assertEquals(1, result.size());
        assertEquals("Ayo", result.get(0).getFirstName());
    }
    @Test
    public void testFindByFirstNameNotFind() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);
        List<Contact> result = phoneBook.findByFirstName("Obi");
        assertTrue(result.isEmpty());
    }
    @Test
    public void testEditContactSuccess() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);

        Contact updated = new Contact("Ayo", "Uzor", "08012345678");
        phoneBook.editContact("08012345678", updated);

        Contact result = phoneBook.findByPhoneNumber("08012345678");
        assertEquals(updated.getLastName(), result.getLastName());
        assertEquals("Uzor", result.getLastName());
    }
    @Test
    public void testCaseInsensitiveSearchFirstName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Joy", "Ike", "07012345678"));
        List<Contact> result = phoneBook.findByFirstName("joy");
        assertEquals(1, result.size());
        assertTrue("joy".equalsIgnoreCase(result.get(0).getFirstName()));

    }
    @Test
    public void testCaseInsensitiveSearchLastName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Ken", "Uche", "07012345679"));
        List<Contact> result = phoneBook.findByLastName("UCHE");
        assertEquals(1, result.size());
    }
    @Test
    public void testRemoveNonExistingContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Ken", "Uche", "07012345679"));
        phoneBook.removeContact("0990000000");
        assertEquals(1, phoneBook.getAllContacts().size());

    }



}