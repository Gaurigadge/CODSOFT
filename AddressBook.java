import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class AddressBook {
    private List<Contact> contacts;
    
    public AddressBook() {
        contacts = new ArrayList();
    }
    
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact included: " + name);
    }
    
    public void displayContacts() {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("-------------------");
        }
    }
    
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner give = new Scanner(System.in);
        
        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = give.nextInt();
            give.nextLine();  // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Your Good Name: ");
                    String name = give.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = give.nextLine();
                    addressBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.println("Exiting Address Book.");
                    give.close();
                    System.exit(0);
                default:
                    System.out.println("Unacceptable choice. Please try again.");
            }
        }
    }
}