package PhoneBook;

public class Contact {
    private String phoneNumber;
    private String name;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("""
                name: %s
                phoneNumber: %s
                """, name, phoneNumber);
    }
}
