package Dairy;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static Dairy dairy;

    private static Scanner keyboardInputCollector = new Scanner(System.in);

   // private static Entry entry = new Entry();

    public static void main(String[] args) {gotoDaiyRoom();}

        private static void gotoDaiyRoom() {
            String DairyRoom = """
            Welcome Our Dairy Room
            1 -> Create Entry
            2 -> View Entry
            3 -> Delete Entry
            4 -> Count Entry
            5 -> Edit Entry
            6 -> Exit Entry
                        """;
            String userInput = input(DairyRoom);
            switch(userInput.charAt(0)){
                case '1' -> createEntry();
                //case '2' -> viewEntry();
                case '3' -> deleteEntry();
                case '4' -> countEntry();
               // case '5' -> editEntry();
                case '6' -> existEntry();
            }
        }

//    private static void editEntry() {
//        display(entry.getBody());
//        gotoDaiyRoom();
//    }

    private static void existEntry() {
        display("Thanks for your time !!!");
        System.exit(1);
    }

    private static void countEntry() {
        gotoDaiyRoom();
    }

    private static void deleteEntry() {
        display("Your Dairy is Successfully Deleted !!!");
        gotoDaiyRoom();
    }

//    private static void viewEntry() {
//        display(entry.getBody());
//        gotoDaiyRoom();
//    }

    private static void createEntry() {
        String title = input("Enter a tittle for your Entry");
        String body = input("Enter a body of your Entry");
        int iD = Integer.parseInt(input("Enter an ID"));
        display ("Your Dairy is Successfully Created !!!");
        gotoDaiyRoom();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);

    }
    private static void display(String prompt){

        JOptionPane.showMessageDialog(null, prompt);
    }
}
