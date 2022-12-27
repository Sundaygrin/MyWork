package assignment;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = input.nextInt();

        if (today == 0) {
            System.out.println("\n Sunday");
            today = input.nextInt();
            }
        if (today == 1) {
            System.out.println("\n Monday");
            today = input.nextInt();
        }
        if (today == 2) {
            System.out.println("\n Tuesday");
            today = input.nextInt();
        }
        if (today == 3) {
            System.out.println("\n Wednesday");
            today = input.nextInt();
        }
        if (today == 4) {
            System.out.println("\n Thursday");
            today = input.nextInt();
        }
        if (today == 5) {
            System.out.println("\n Friday");
            today = input.nextInt();
        }
        if (today == 6) {
            System.out.println("\n Saturday");
            today = input.nextInt();
        }
        
    }
}
