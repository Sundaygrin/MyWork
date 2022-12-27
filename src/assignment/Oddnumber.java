package assignment;

import java.util.Scanner;

public class Oddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Odd number from 1-19");
        int userinput = input.nextInt();

        if (userinput % 2 != 0 && userinput <= 19)
            System.out.println("Enter odd number");

            else
            System.out.println("you've Enter an Even number");

        //switch (userinput) {
          //  case 1:
            //    System.out.println("Enter Odd number ");
                //  break;
            //case 3:
               // System.out.println("Enter Odd number");
               // break;
            //case 5:
              //  System.out.println("Enter Odd number");
               // break;
            //case 7:
                //System.out.println("Enter Odd number");
               // break;
            //case 9:
              //  System.out.println("Enter Odd number");
                //break;
            //case 11:
              //  System.out.println("Enter Odd number");
                //break;
            //case 13:
              //  System.out.println("Enter Odd number");
                //break;
            //case 15:
              //  System.out.println("Enter Odd number");
                //break;
            //case 17:
              //  System.out.println("Enter Odd number");
                //break;
            //case 19:
              //  System.out.println("Enter Odd number");
                //break;
        }
    }
