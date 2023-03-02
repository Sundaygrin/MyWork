package Estore;

public class User {
    private long age;
    private String emailAddress;
    private Address homeAddress;
    private String name;
    private String password;
    private String phoneNumber;

//    public User(long age, String emailAddress, Address homeAddress, String name, String password, String phoneNumber) {
//        this.age = age;
//        this.emailAddress = emailAddress;
//        this.homeAddress = homeAddress;
//        this.name = name;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

