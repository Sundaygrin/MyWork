package chapterTwo;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an Integer: ");
        int x = input.nextInt();

        System.out.println("Enter an Integer: ");
        int y = input.nextInt();

        System.out.println("Enter an Integer: ");
        int z = input.nextInt();


        int mul = (x * y * z);
        System.out.printf(" Product is %d%n " , mul);
    }
}
