package chapterFive;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a,b;

        for ( a = 1; a <= 10 ; a++) {
            for ( b = 0; b < a ; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 0;

        for (i = 0; i <= 10 ; i++) {
            for ( a = 10; a > i ; a--) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
