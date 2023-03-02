package PhoneBook;

import javax.swing.*;
import java.util.Scanner;

public class MainPhoneBook {

    public static PhoneBook phoneBook;

    private static Scanner keyboardInputCollector = new Scanner(System.in);

    public static void main(String[] args) {gotoPhoneBook();}

    private static void gotoPhoneBook() {
        String PhoneBook = """
               ############################################## 
               Welcome to your PhonebBook
                1: Create Contact
                2: Edit Contact
                3: Delete Contact
                4: Find Contact
                5: Exist Contact
                ##############################################
                """;

        String userInput = input(PhoneBook);
        switch (userInput.charAt(0)){
            case '1' -> CreateContact();
            case '2' -> EditContact();
            case '3' -> DeleteContact();
            case '4' -> FindContactByName();
            case '5' -> ExistContact();
        }

    }
    private static void CreateContact() {
        String PhoneNumber = input("Enter your phone Number");
        String Name = input("Enter the name you want to Save your number with");
        display("Contact Successfully Created !!! ");
        gotoPhoneBook();
    }

    private static void EditContact() {

        gotoPhoneBook();
    }

    private static void DeleteContact() {
       String phoneNumber = input("Enter phoneNumber");
       String name = input("Enter Name");
        display("Your Dairy is Successfully Deleted !!!");
        gotoPhoneBook();
    }

    private static void FindContactByName() {
        String name = input("Enter your name");
        display("your Result");
        gotoPhoneBook();
    }
    private static void ExistContact() {
        display("Thanks for your time !!!");
        System.exit(1);
    }
    private static void display(String Prompt) {
        JOptionPane.showMessageDialog(null, Prompt);
    }

    private static String input(String Prompt) {
       return JOptionPane.showInputDialog(Prompt);
    }

}
