package DSA;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private final PhoneBookMenu phoneBookMenu = new PhoneBookMenu();
    private final MessageMenu messageMenu = new MessageMenu();
    private final Chat chat = new Chat();
    private final CallRegisterMenu callRegisterMenu = new CallRegisterMenu();
    private final ToneMenu toneMenu = new ToneMenu();
    private final SettingMenu settingMenu = new SettingMenu();
    private final CallDivert callDivert = new CallDivert();
    private final GameMenu gameMenu = new GameMenu();
    private final Calculator calculator = new Calculator();
    private final RemaindersMenu remaindersMenu = new RemaindersMenu();
    private final ClockMenu clockMenu  = new ClockMenu();
    private final Profiles profiles = new Profiles();
    private final SIMServices simServices = new SIMServices();

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
    }
    private void showMainMenu() {
        while (true) {
            System.out.println("Welcome to Noika App");
            System.out.println("1. Phone Book");
            System.out.println("2. Message");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tone");
            System.out.println("6. Setting");
            System.out.println("7. Call Divert");
            System.out.println("8. Game");
            System.out.println("9. Calculator");
            System.out.println("10. Remainders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
            System.out.println("14. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();


        }  }
}
