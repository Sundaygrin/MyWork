package Dairy;
import java.util.List;

public  class Dairy {

    private  String username;
    private String password;
    private  boolean isLocked= false;
    private List<Entry> entries;

    public Dairy(String username,String password){
        this.username = username;
        this.password = password;
    }
    public boolean unlockDairy(String password){
      isLocked = !password.equals(this.password);
        return false;
    }

    public void lockDairy(){
        isLocked();
    }
    public boolean isLocked(){
        return isLocked = true;
    }

    public void createEntry(String title, String body){
        Entry entry = new Entry(title, body, 1);
        entries.add(entry);

    }
    public boolean deleteEntry(int entryId){
        Entry id = findEntryById(1);
        entries.remove(id);
        System.out.println("deleted");
        return false;
    }
    public Entry findEntryById(int entryId){
        return entries.get(entryId);
    }
    public void updateEntry(int entryId, String title, String body){
        var foundEntry = findEntryById(1);
        foundEntry.setTittle(title);
        foundEntry.setBody(body);
        entries.add(foundEntry);
    }
}
