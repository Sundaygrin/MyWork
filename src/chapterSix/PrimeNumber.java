package chapterSix;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean flag = false;
        for (int i = 1; i <= number ; i++) {

            if (number % i == 1) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(number + "is a prime number. ");
        else
            System.out.println(number + "is not a prime number");

        }
    }
