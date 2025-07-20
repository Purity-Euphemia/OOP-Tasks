package DSA;
import java.util.List;
import java.util.ArrayList;

public class RemaindersMenu {
    private final List<String> remainder = new ArrayList<>();

    public String addRemainder(String note) {
        remainder.add(note);
        return "Remainder added: " + note;
    }
    public String deleteRemainder(String note) {
        if (remainder.remove(note)) {
            return "Remainder deleted: " + note;
        }
        return "No such remainder" + note;
    }
    public String viewRemainders() {
        if (remainder.isEmpty()) {
            return "No remainders";
        }
        return String.join(", ", remainder);
    }
}
