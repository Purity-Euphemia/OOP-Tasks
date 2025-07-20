package DSA;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = true;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public ArrayList<Entry> getEntries() {
        return entries;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
