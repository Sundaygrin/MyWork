package Dairy;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DairyTest {

    @Test
    public void unlockDairy() {
        Dairy dairy = new Dairy("grin", "sunday2023");
        dairy.lockDairy();
        assertEquals(true, dairy.isLocked());
        dairy.unlockDairy("sunday2023");
        assert(dairy.unlockDairy("sunday2023"));
    }

    @Test
    void lockDairy() {
        Dairy dairy = new Dairy("grin", "sunday2023");
        dairy.lockDairy();
        assertTrue(dairy.isLocked());
    }

    @Test
    public void createEntry() {
        Dairy dairy = new Dairy("grin", "sunday2023");
        dairy.isLocked();
        dairy.unlockDairy("sunday2023");


//        dairy.createEntry("life", "Java is showing me shege");
//        assertEquals(1, dairy.findEntryById(1));
    }
//
//    @Test
//    void deleteEntry() {
//        Dairy dairy = new Dairy("grin", "sunday2023");
//        dairy.deleteEntry(1);
//        assertTrue(dairy.deleteEntry(1));
//    }
//
//    @Test
//    void findEntryById() {
//        Dairy dairy = new Dairy("grin", "sunday2023");
//        dairy.findEntryById(1);
//    }
//
//    @Test
//    void updateEntry() {
//        Dairy dairy = new Dairy("grin", "sunday2023");
//        dairy.updateEntry(1,"Life","Java is showing me Pepe");
//        assertTrue();
//    }


}