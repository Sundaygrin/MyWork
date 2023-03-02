package Email;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Email extends Mail{
    private String emailAddress;
    private List<Mail> mail = new ArrayList<>();

    public Email(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void createMail(String name,String password,String phoneNumber)   {
        Email email = new Email("sundaycharles@gmail.com");
        email.setName(name);
        email.getPhoneNumber(phoneNumber);
        mail.add(email);
    }
    public void deleteMail(String emailAddress) {
        var foundMail = searchMail("sundaycharles@gmail.com");
        mail.remove(foundMail);
        System.out.println("Mail Successfully Deleted");
    }

    public Mail searchMail(String emailAddress) {
        for (Mail email:mail) {
            if (Objects.equals(email.getEmailAddress(), emailAddress));
            return email;
        }
        return null;
    }


    public boolean isLocked() {
        return true;
    }

    public boolean unLockMail() {
        return true;
    }

    public int SizeOfMail() {
        return mail.size();
    }


    public void receiveMail(String emailAddress) {
        Email email = new Email("sundaycharles@gmail.com");
        email.getEmailAddress();
        mail.add(email);
    }

}
