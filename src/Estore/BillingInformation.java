package Estore;

public class BillingInformation{
    private String name;
    private String phoneNumber;
    private Address address;
    private CreditCardInformation creditCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCardInformation getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardInformation creditCard) {
        this.creditCard = creditCard;
    }
}
