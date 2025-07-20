package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NokiaTest {

    @Test
    public void testThatNokiaIsCreated(){
        Nokia nokia = new Nokia();
        System.out.println(nokia);
        assertNotNull(nokia);
    }
    @Test
    public void testThatNokiaCanBeTurnedOn(){
        Nokia nokia = new Nokia();
        nokia.turnOn();
        assertTrue(nokia.getStatus());
    }
    @Test
    public void testThatNokiaCanBeTurnedOff(){
        Nokia nokia = new Nokia();
        nokia.turnOff();
        assertFalse(nokia.getStatus());
    }
    @Test
    public void testThatRemindersCanAddRemainder(){
        RemaindersMenu remaindersMenu = new RemaindersMenu();
        String note = "Test Reminder";
        String result = remaindersMenu.addRemainder(note);
        assertEquals("Remainder added: Test Reminder", result);
    }
    @Test
    public void testThatRemindersCanDeleteRemainder(){
        RemaindersMenu remaindersMenu = new RemaindersMenu();
        String note = "Test Reminder";
        remaindersMenu.addRemainder(note);
        String result = remaindersMenu.deleteRemainder(note);
        assertEquals("Remainder deleted: Test Reminder", result);
    }
    @Test
    public void testThatRemindersCanListRemainders() {
        RemaindersMenu remaindersMenu = new RemaindersMenu();
        String note = "Test Reminder";
        remaindersMenu.addRemainder(note);
        String result = remaindersMenu.viewRemainders();
        assertEquals("Test Reminder", result);
    }
    @Test
    public void testProfileCanBeSelected(){
        Profiles profiles = new Profiles();
        String result = profiles.selectProfiles("Silent");
        assertEquals("Profile selected: Silent", result);
    }
    @Test
    public void testProfilesCanChangeProfile(){
        Profiles profiles = new Profiles();
        String result = profiles.selectProfiles("Meeting");
        assertEquals("Profile selected: Meeting", result);
    }
    @Test
    public void testProfilesGetDefualtProfile(){
        Profiles profiles = new Profiles();
        String result = profiles.selectProfiles("General");
        assertEquals("Profile selected: General", result);
    }
}
