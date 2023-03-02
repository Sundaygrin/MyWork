package chapterFive;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your triangle : ");
        int number = input.nextInt();
        int a,b;

        for ( a = 1; a <= number ; a++) {
            for ( b = 0; b < a ; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Enter the length of your triangle : ");
        int number1 = input.nextInt();
        int i = 0;

        for (i = 0; i <= number1 ; i++) {
            for ( a = number1; a > i ; a--) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
