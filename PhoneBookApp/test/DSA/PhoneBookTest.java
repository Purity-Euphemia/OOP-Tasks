package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAddContact(){
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Ayo", "Ade", "08012345678");
        phoneBook.addContact(contact);
        assertEquals(1, phoneBook.getAllContacts().size());
    }
    @Test
    public void testAddSecondContact(){
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
        phoneBook.removeContact(contact1);
        assertEquals(1, phoneBook.getAllContacts().size());

    }

}
