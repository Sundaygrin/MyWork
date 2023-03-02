package ledLight;

public class Reciept {


    String productName;
    double price;
    double totalPrice;
    String cashierName;

            public Reciept(){}

            public Reciept (String productName, double price, double totalPrice){
        this.price = price;
        this.productName = productName;
        this.totalPrice = totalPrice;

            }

    public void setProductName(String productName){
                return;
            }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price){
                return;
    }

    public double getPrice() {
        return price;
    }

    public void setTotalPrice(double totalPrice){
                return;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setCashierName(String cashierName){
                return;
    }

    public String getCashierName() {
        return cashierName;
    }


    public void display(){
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        System.out.println("\nItem\t\t\t Quantity \t\t\t Price \t\t\t Total (NGN)\n");
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
    }



    }
