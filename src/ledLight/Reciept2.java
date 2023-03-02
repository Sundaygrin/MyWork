package ledLight;


import java.text.SimpleDateFormat;
import java.util.*;


public class Reciept2 {
    public static void main(String[] args) {
        Reciept reciept = new Reciept();

        int quantity;
        double subtotal;
        double vatAmount;
        double overAllPrice = 0;
        double discount;
        String productName;
        double price;
        double totalPrice;
        char choice;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer name");
        String customerName = input.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateTime = new Date();

        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        List<Reciept> products = new ArrayList<>();

        do {
            System.out.println("Enter product details");
            System.out.println("Enter product name");
            productName = input.nextLine();

            System.out.println("Enter quantity");
            quantity = input.nextInt();

            System.out.println("Enter price");
            price = input.nextDouble();


           totalPrice = (price * quantity);
            overAllPrice += totalPrice;

            products.add(new Reciept(productName, price, totalPrice));
            System.out.println("do u wnt more products (y or n)");
            choice = input.next().charAt(0);
            input.nextLine();
        }
        while (choice == 'Y' || choice == 'y');
        System.out.println("===========================================================================");
        System.out.println("Spar Nigeria");
        System.out.println("Tejuosho ");
        System.out.println("Yaba");

        System.out.println("date" + simpleDateFormat.format(dateTime) + "" + days [calendar.get(Calendar.DAY_OF_WEEK)-1]);

        reciept.display();

        for (Reciept r : products){
            r.display();
        }
        System.out.println("===========================================================================");
        System.out.println("");
        System.out.println("total Amount (NGN) :" + overAllPrice);

        discount = overAllPrice * 0.02;
        System.out.println("discount" + discount);

        subtotal = overAllPrice - discount;
        System.out.println("sub" + subtotal);

        vatAmount = overAllPrice * 0.07;
        System.out.println("vatAmount (7%) :" + vatAmount);

        System.out.println("Invoice total" + (subtotal + vatAmount));

        System.out.println("============================Thanks for Shopping===============================");

        System.out.println("==============================================================================");

        input.close();

    }


}
