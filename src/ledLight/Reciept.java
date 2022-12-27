package ledLight;

public class Reciept {

    String productName;
    String price;
    String totalPrice;
    String cashierName;

            public Reciept (String productName, String price, String totalPrice){
        this.price = price;
        this.productName = productName;
        this.totalPrice = totalPrice;
        cashierName = cashierName;
            }

    public void setProductName(String productName){
                return;
            }

    public String getProductName() {
        return productName;
    }

    public void setPrice(String price){
                return;
    }

    public String getPrice() {
        return price;
    }

    public void setTotalPrice(String totalPrice){
                return;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setCashierName(String cashierName){
                return;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void Display(){
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        System.out.printf("/nItem/t/t/t Quantity /t/t/t Price /t/t/t Total (NGN)/n");
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
    }

}