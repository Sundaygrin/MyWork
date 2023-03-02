package assignment;

import javax.swing.*;
import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Phone Book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profile
                13. Sim Services
                """);
        System.out.println("Welcome User pick an Option");
        int input = scanner.nextInt();

        switch (input) {
            case 11 -> {
                System.out.println("""
                          1. Alarm clock
                          2. Clock setting
                          3. Date setting
                          4. Stopwatch
                          5. Countdown timer
                          6. Auto update of date and time
                          """);
                System.out.println("Pick a number");
                input = scanner.nextInt();
                break;
            }
            case 1 -> {
                System.out.println("""
                        1. Search
                        2. Service Nos.
                        3. Add Name
                        4. Earse
                        5. Edit
                        6. Assign Tone
                        7. Send b'card
                        8. Options
                        9. Speed Dials
                        10.Voice Tags
                        """);
                System.out.println("Pick a number");
                input = scanner.nextInt();


                switch (input) {
                    case 8 -> {
                        System.out.println("""
                                1. Type of View
                                2. Memory Status
                                """);
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                }
                break;
            }
            case 2 -> {
                System.out.println("""
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture Message
                        5. Templates
                        6. Smileyes
                        7. Messages Settings
                        8. Info Service
                        9. Voice Mailbox Number
                        10. Service Command Editor
                        """);
                System.out.println("Pick a number");
                input = scanner.nextInt();
                break;
            }

                    case 7 -> {
                System.out.println("""
                        1. Set
                        2. Common
                        """);
                System.out.println("Pick a number");
                input = scanner.nextInt();

                switch (input) {

                    case 1 -> {
                        System.out.println("""
                                1. Message Center Number
                                2. Message Sent 
                                3. Message Validity
                                """);
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                    case 2 -> {
                        System.out.println("""
                                1. Delivery
                                2. Reply via Same Center
                                3. Character Support
                                """);
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                }
                break;
            }
            case 3 -> {
                break;
            }
            case 4 -> {
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Diled number
                        4. Erase recent Call list
                        5. Show call Duration
                        6. Show call cost
                        7. Call cost settings
                        8. Prepaid Credit
                        """);
                System.out.println("Pick a number");
                input = scanner.nextInt();

                switch (input) {

                    case 5 -> {
                        System.out.println("""
                                1. Last call Duration
                                2. All calls' Duration
                                3. Recieved calls' Duration
                                4. Dialed calls' Duration
                                5. Clear Timers""");
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }

                    case 6 -> {
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters""");
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }

                    case 7 -> {
                        System.out.println("""
                                1. Call cost limit
                                2. Show costs in""");
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                }
                break;
            }
            case 5 -> {
                System.out.println("""
                        1. Ringing Tone
                        2. Ringing volume
                        3. Incoming call Alert
                        4. Composer
                        5. MessageKeypad Tones
                        6. Keypad Tones
                        7. Warning and games tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                System.out.println("Pick a number");
                input = scanner.nextInt();
                break;
            }

            case 6 -> {
                System.out.println("""
                        1. Call setting
                        2. Phone setting
                        3. Security setting
                        4. Restore factory setting""");
                System.out.println("Pick a number");
                input = scanner.nextInt();

                switch (input) {
                    case 1 -> {
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting Option
                                4. Phone line in use
                                5. Automatic answer""");
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                    case 2 -> {
                        System.out.println("""
                                1. Language 
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Light
                                6. Confirm SIM cservice actions
                                """);
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                    }
                    case 3 -> {
                        System.out.println("""
                                1. Pin code request
                                2. Call bring service
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone security
                                6. Change access code""");
                        System.out.println("Pick a number");
                        input = scanner.nextInt();
                        break;
                    }

                    case 4 -> {
                        break;
                    }


            case 7 -> {
                        break;
                    }

            case 8 -> {
                        break;
                    }

            case 9 -> {
                        break;
                    }

            case 10 -> {
                        break;
                    }

            case 12 -> {
                        break;
            }

            case 13 -> {
                        break;
            }

                }
            }
        }
    }

}