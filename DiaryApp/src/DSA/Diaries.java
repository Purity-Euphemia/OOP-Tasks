package DSA;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<String> diary = new ArrayList<>();
    private int index = 0;


    public ArrayList<String> getDiary() {
        return diary;
    }

    public void setDiary(ArrayList<String> diary) {
        this.diary = diary;
    }
    public String[] diaryNames() {
        return diary.toArray(new String[diary.size()]);
    }

    public void add(String firstName, String lastName) {
        diary.add(firstName + " " + lastName);

    }

    public void findByName(String chioma, String obi) {

    }
}
