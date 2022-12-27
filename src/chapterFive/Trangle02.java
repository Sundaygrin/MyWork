package chapterFive;

import java.util.Scanner;

public class Trangle02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int a,b;

        for ( a = 1; a <= 10; a++) {
            for ( b = 0; b < a ; b++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
