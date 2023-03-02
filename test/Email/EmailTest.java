package Email;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailTest {
    Email mail;

    @BeforeEach
    void setUp() {
        mail = new Email("sundaycharles@gmail.com");
        mail.createMail("Sunday","sunday123","09019835952");
    }

    @Test
    public void createMailTest() {
        mail.isLocked();
        mail.unLockMail();
        assertEquals(1,mail.SizeOfMail());
    }

    @Test
    public void deleteMailTest(){
       mail.deleteMail("sundaycharles@gmail.com");
       assertEquals(0,mail.SizeOfMail());
    }

    @Test
    public void searchMailTest(){
        String format = """
                name: Sunday
                emailAddress: sundaycharles@gmail.com
                """;

        assertEquals(format, mail.searchMail("sundaycharles@gmail.com").toString());
    }

    @Test
    public void receiveMailTest(){
        mail.receiveMail("sundaycharles@gmail.com");
        assertEquals(2,mail.SizeOfMail());
    }

    @Test
    public void lockMailTest(){
        mail.isLocked();
        assertTrue(mail.isLocked());
    }

    @Test
    public void unLockMailTest(){
        mail.isLocked();
        mail.unLockMail();
        assertTrue(mail.unLockMail());
    }
}