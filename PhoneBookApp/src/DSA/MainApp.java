package DSA;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("Welcome to Phone Book App");

        while(true){
            System.out.println("1. Add a new contact");
            System.out.println("2. Search a contact");
            System.out.println("3. Update a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Display all contacts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.print("Enter first name: ");
                String FirstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String LastName = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String PhoneNumber = scanner.nextLine();

                Contact contact = new Contact(FirstName, LastName, PhoneNumber);
                phoneBook.addContact(contact);
                System.out.println("Contact added successfully");
            }
            else if (choice == 2){
                System.out.print("Enter phone number to search: ");
                String phoneNumber = scanner.nextLine();
                Contact foundContact = phoneBook.findByPhoneNumber(phoneNumber);
                if(foundContact != null){
                    System.out.println(foundContact);
                }
                else{
                    System.out.println("No such contact");
                }
            }
        }
    }
}
