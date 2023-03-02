package PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private String password;
    private boolean isLocked = false;
    private List<Contact> contacts = new ArrayList<>();


    public PhoneBook(String password){
        this.password = password;
    }
    public void createContact(String phoneNumber, String name){
    Contact contact = new Contact();
        contact.setName(name);
        contact.setPhoneNumber(phoneNumber);
        contacts.add(contact);

    }
    public void deleteContact(String phoneNumber){
        var foundContact = findContact("09019835952");
        contacts.remove(foundContact);
        System.out.println("Contact Successfully Deleted");
    }
    public Contact findContact(String phoneNumber){
        for (Contact contact:contacts) {

            if (Objects.equals(contact.getPhoneNumber(), phoneNumber))
                return contact;
        }

        return null;
    }
    public void lockContact(){
        isLocked();
    }
    public boolean isLocked(){
        return isLocked = true;
    }
    public void editContact(String phoneNumber, String name){
        var foundContact = findContact("09019835952");
        foundContact.setPhoneNumber(phoneNumber);
        foundContact.setName(name);
        contacts.add(foundContact);
    }
    public void unlockContact(String password) {
        isLocked = !password.equals(this.password);
    }



    public int SizeOfContact (){
        return contacts.size();
    }
}


