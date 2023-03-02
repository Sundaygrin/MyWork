package Email;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static Email email;

    private static Scanner keyboardInputCollector = new Scanner(System.in);

    public static void main(String[] args) {gotoEmail();}
        private static void gotoEmail() {
        String Email = """
                Welcome to your Email App
                1: Create Mail
                2: Delete Mail
                3: Receive Mail
                4: Search for Mail
                5: Exist Mail
                """;
            String userInput = input(Email);
            switch (userInput.charAt(0)){
                case '1' -> CreateMail();
                case '2' -> DeleteMail();
                case '3' -> ReceiveMail();
                case '4' -> SearchForMail();
                case '5' -> ExistMail();
    }
}

    private static void CreateMail() {
        String name = input("Enter your Name ");
        String phoneNumber = input("Emter your Phone Number ");
        String emailAddress = input("Enter Email Address of your Choice");
        display("Loading.............");
        display("Your Email Account is Successfully Created");
        gotoEmail();
    }
    private static void DeleteMail() {
        String emailAddress = input("Enter your Email Address");
        display("Loading.............");
        display("Mail Successfully Deleted");
        gotoEmail();
    }

    private static void ReceiveMail() {
        String emailAddress = input("Enter your Email Address");
        display("Email Received !!!");
        gotoEmail();
    }

    private static void SearchForMail() {
        String emailAddress = input("Enter your Email Address");
        display("Searching for Mail....");
        display("Done !!!");

    }

    private static void ExistMail() {
        display("Thanks !!!");
        System.exit(1);
    }
    private static void display(String Prompt) {
        JOptionPane.showMessageDialog(null, Prompt);
    }

    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);
    }
}