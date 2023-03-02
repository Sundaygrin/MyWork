package Estore;

public class Customer extends User{
   private ShoppingCart cart;
   private BillingInformation billingInformation;

   public ShoppingCart getCart() {
      return cart;
   }

   public void setCart(ShoppingCart cart) {
      this.cart = cart;
   }

   public BillingInformation getBillingInformation() {
      return billingInformation;
   }

   public void setBillingInformation(BillingInformation billingInformation) {
      this.billingInformation = billingInformation;
   }
}
