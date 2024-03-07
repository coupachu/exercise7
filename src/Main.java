import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Contact john = new Contact("john", "john@johnmail.john");
        BusinessContact johnny = new BusinessContact("johnny", "johnny@johnnymail.Johnny", "123412342314");
        ArrayList<Contact> myList = new ArrayList<>();
        ContactBook myBook = new ContactBook(myList);
        myBook.addContact(john);
        myBook.addContact(johnny);
        myBook.display();
    }

    static Contact createContact(){
        System.out.println("input a name");
        String name = input.nextLine();
        System.out.println("input an email");
        String email = input.nextLine();
        return new Contact(name, email);
    }
    static BusinessContact createBusinessContact(){
        System.out.println("input a name");
        String name = input.nextLine();
        System.out.println("input an email");
        String email = input.nextLine();
        System.out.println("input a phone number");
        String phoneNumber = input.nextLine();
        return new BusinessContact(name, email, phoneNumber);
    }
}