package chapterTwo;

import java.util.Scanner;

public class Comparism {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter secod integer: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
        System.out.println("Goodboy");
        }
        else
            System.out.println("70years old man");
    }
}
