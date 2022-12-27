package ledLight;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CcValidator {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter CardDetails");
      String cardDetails = input.nextLine();
      String[] cardDetailsArray = new String[cardDetails.length()];

    for (int index = 0; index < cardDetailsArray.length; index++) {
 cardDetailsArray[index] = String.valueOf(cardDetails.charAt(index));

     }

      System.out.println(Arrays.toString(cardDetailsArray));
      if (cardDetailsArray.length < 13 || cardDetailsArray.length > 16){
          System.out.println("In Valid Card Details");
      }
      else {
          if (Objects.equals(cardDetailsArray[0], "4")){
              System.out.println("Visa Card");
          }
          else {
              if (Objects.equals(cardDetailsArray[0], "6")){
                  System.out.println("Discovery Card");
              }
          }
          int counter = 1;
          int [] secondDigitOfTheCard = new int [counter];
          for (int i = cardDetailsArray.length - 2; i >= 0 ; i-=2) {
              secondDigitOfTheCard = new int[counter];
              counter ++;
          }

      }
  }
}