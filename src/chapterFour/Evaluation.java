package chapterFour;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number : ");
        float num1 = number.nextFloat();
        float result= 0;
        for (float counter = 1; counter <= num1; counter++) {
            result = (1 / counter);

       }
           System.out.println(result);



    }
}
