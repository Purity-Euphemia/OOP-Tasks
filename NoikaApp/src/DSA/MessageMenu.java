package DSA;

import java.util.Scanner;

public class MessageMenu {
    private final Scanner scanner = new Scanner(System.in);

    public void showMessage() {
        System.out.println("Message Menu");

        System.out.println("""
                1. Write Messages
                2. Inbox
                3. Outbox
                4. Pictures Messages
                5. Templates
                6. Smileys
                7. Message Settings
                8. Info Service
                9. Voice Mailbox Number
                10. Service command editor
                """);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Write Messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Pictures Messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("Message Settings");
                if (choice == 7) {
                    System.out.println("""
                            1. Set 1
                            2. Common
                            """);
                    int set = scanner.nextInt();
                    switch (set) {
                        case 1:
                            System.out.println("Set 1");
                            if (set == 1) {
                                System.out.println("""
                                        1. Message Center Number
                                        2. Message Sent As
                                        3. Message Validity  
                                        """); break;
                            } else if (set == 2) {
                                System.out.println("""
                                                1. Delivery Reports
                                                2. Reply Via Same Centre
                                                3. Character Support
                                        """); break;
                            }
                case 8:
                    System.out.println("Info service");
                    break;
                case 9:
                    System.out.println("Voice Mailbox Number");
                    break;
                case 10:
                    System.out.println("Service command editor");
                    break;

                    }
                }
        }


    }
}
