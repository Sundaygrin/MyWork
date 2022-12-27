package chapterTwo;

import java.util.Scanner;

public class radius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        double r = input.nextDouble();
        double area=(22*r*r)/7;
        System.out.println("Area ofCircle is: " +  area);
    }
}
