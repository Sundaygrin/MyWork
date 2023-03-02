package PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    PhoneBook con;
    @BeforeEach
    void setUp() {

    con = new PhoneBook("sunday2023");
    con.createContact("09019835952","Sunday");

    }
    @Test
   public void createContactTest(){

     con.isLocked();
     con.unlockContact("sunday2023");
        assertEquals(1,con.SizeOfContact());

   }

    @Test
    public void deleteContactTest() {

        con.deleteContact("09019835952");
        assertEquals(0,con.SizeOfContact());
    }

    @Test
    public void findContactTest() {
        String format = """
                name: Sunday
                phoneNumber: 09019835952
                """;

             assertEquals(format, con.findContact("09019835952").toString());
    }

    @Test
    public void lockContactTest() {
        PhoneBook contact = new PhoneBook( "sunday2023");
        contact.lockContact();
        assertTrue(contact.isLocked());
    }


    @Test
    public void editContactTest() {
        PhoneBook contact = new PhoneBook( "sunday2023");
    }

    @Test
    public void unlockContactTest() {
     PhoneBook contact = new PhoneBook( "sunday2023");
     contact.isLocked();
     assertEquals(true, contact.isLocked());
     contact.unlockContact("sunday2023");
    }
}