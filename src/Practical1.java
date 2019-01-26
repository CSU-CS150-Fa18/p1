import java.util.Scanner;

/**
 *  <h1> Practical 1 - CS 150: ASCII Astrologer </h1>
 *
 *  <h2>Topics covered</h2>
 *  <ul>
 *      <li>System.out.print/println</li>
 *      <li>Methods and returning values from methods</li>
 *      <li>String concatenation</li>
 *      <li>Variables and assignment</li>
 *  </ul>
 *
 * @author YOUR_NAME <br>
 *         YOUR_EMAIL <br>
 *         Colorado State University
 * @version 201910
 */
public class Practical1 {
    // this is an object used across multiple methods for reading in user input
    private final Scanner scanner = new Scanner(System.in);

    // these are known as instance / class level variables you should initialize / set them
    /** Name of the astrologer / application developer **/
    String astrologerName;

    /** Email of the astrologer / developer **/
    String astrologerEmail;


    /**
     * This method is used to test the methods you are developing individually.
     * This allows for a Divide-Conquer-Glue development style, as
     * you can test every method as it is being developed. This is further extended
     * in future classes using something called unit testing and juint which you learn
     * in CS 165 if you continue on in CS.
     *
     * For this class you may COMMENT OUT portions of this method for easier
     * debugging. We never actually test this method.
     * It is only here for development purposes.
     *
     * Before you turn in, you will want to comment out the call of
     * this method in the public static void main(String[] args) method.
     */
    public void testMethod() {
        System.out.println("Running Tests....");

        System.out.println("Astrologer Name is: " + astrologerName);
        System.out.println("Astrologer Email is: " + astrologerEmail);

        System.out.println("Printing Business Card");
        System.out.println(getBusinessCard());

        System.out.println("Printing Zodiac cards");
        printAries();
        printAquarius();
        printCapricorn();
        printPisces();
        printTaurus();
        printGemini();
        printCancer();
        printLeo();
        printVirgo();
        printLibra();
        printScorpio();
        printSagittarius();

        System.out.println("Finished Tests...");
        System.out.println();
        System.out.println();
    }

    /**
     * Main menu for user interaction. Will continue to call itself until
     * 0 is typed.
     */
    public void mainMenu() {
        String menu = getMainMenuMessage();

        //TODO: print out the menu - but don't print a new line

        int input = getClientInputAsInt();

        if(input == 0) {
            return;  // this allows you to exit the main menu. Without it, the program would run without stopping.
        }else if(input == 1) {
            //TODO: print the business guard by getting the String from getBusinessCard(), and then print it
            // you should print a blank line before printing the business card
        }else if(input == 2) {
            zodiacMenu();
        }else {
            System.out.println(getInvalidMessage());
        }

        System.out.println();
        System.out.println();
        mainMenu();  // this continues to call the main menu, until 0 is typed
    }

    /**
     * Builds a business card based on the class variables {@link #astrologerName}
     * and {@link #astrologerEmail}. Returns a string to be printed out
     * @return the business card. Note that there is no new line on the last line.
     */
    public String getBusinessCard() {
        String str = "";

        return str;
    }


    /**
     * This is a splash screen for the ASCII Astrologer.
     * You should have fun building this screen (but make sure you have time for the rest).
     * It must contain the words ASCII: ASTROLOGER in your splashScreen somewhere.
     * <pre>
     *     ASCII: ASTROLOGER
     * </pre>
     * And it needs to end with two blank lines.
     */
    public void splashScreen() {

    }

    /**
     * Prints an Aries card to System.out. The card
     * must have  ===== ARIES ===== in it, and must lead and end with a blank line.
     * This example card also has the actual star alignment
     * (roughly) for the Aries constellation
     */
    public void printAries() {
        System.out.println();
        System.out.println("+------------------------------------------+");
        System.out.println("|                                          |");
        System.out.println("|    *                                     |");
        System.out.println("|                        *                 |");
        System.out.println("|                                          |");
        System.out.println("|                                          |");
        System.out.println("|                                   *      |");
        System.out.println("|                                          |");
        System.out.println("|                                    *     |");
        System.out.println("|                                          |");
        System.out.println("|            ===== ARIES =====             |");
        System.out.println("+------------------------------------------+");
        System.out.println();
    }

    /**
     * Prints an Aquarius card to System.out. The card must have
     * ===== AQUARIUS ===== in it. This example card
     * uses an ASCII art of the zodiac symbol for aquarius (two wavy lines)
     */
    public void printAquarius() {
        System.out.println();
        System.out.println("+----------------------------------------+");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|             .''-._.-''-._.-            |");
        System.out.println("|             .''-._.-''-._.-            |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|          ===== AQUARIUS =====          |");
        System.out.println("+----------------------------------------+");
        System.out.println();
    }

    /**
     * Prints an Capricorn card to System.out. The card must have
     * ===== CAPRICORN ===== in it. This example card
     * just lists the dates for Capricorn along with the required label.
     */
    public void printCapricorn() {
        System.out.println();
        System.out.println("+----------------------------------------+");
        System.out.println("|         December 22 - January 19       |");
        System.out.println("|                                        |");
        System.out.println("|          ===== CAPRICORN =====         |");
        System.out.println("+----------------------------------------+");
        System.out.println();
    }

    /**
     * Prints an Pisces card to System.out. The card must have
     * ===== PISCES ===== in it. This example card
     * draws a picture based on the following websites example ASCII fish
     * reference: <a href="https://www.asciiart.eu/animals/fish">ASCII Fish</a>.
     */
    public void printPisces() {
        System.out.println();
        System.out.println("+----------------------------------------+");
        System.out.println("|                  /`·.¸                 |");
        System.out.println("|                 /¸...¸`:·              |");
        System.out.println("|              ¸.·´  ¸   `·.¸.·´         |");
        System.out.println("|             : © ):´;      ¸  {         |");
        System.out.println("|              `·.¸ `·  ¸.·´\\`·¸)        |");
        System.out.println("|                  `\\´´\\¸.·´             |");
        System.out.println("|           ===== PISCES =====           |");
        System.out.println("+----------------------------------------+");
        System.out.println();
    }

    /**
     * Prints an Taurus card to System.out. The card must have
     * ===== TAURUS ===== in it
     */
    public void printTaurus() {

    }

    /**
     * Prints an Gemini card to System.out. The card must have
     * ===== GEMINI ===== in it
     */
    public void printGemini() {

    }

    /**
     * Prints an Cancer card to System.out. The card must have
     * ===== CANCER ===== in it
     */
    public void printCancer() {

    }

    /**
     * Prints an LEO card to System.out. The card must have
     * ===== LEO ===== in it
     */
    public void printLeo() {

    }

    /**
     * Prints an VIRGO card to System.out. The card must have
     * ===== VIRGO ===== in it
     */
    public void printVirgo() {

    }

    /**
     * Prints an LIBRA card to System.out. The card must have
     * ===== LIBRA ===== in it
     */
    public void printLibra() {

    }

    /**
     * Prints an SCORPIO card to System.out. The card must have
     * ===== SCORPIO ===== in it
     */
    public void printScorpio() {

    }

    /**
     * Prints an Sagittarius card to System.out. The card must have
     * ===== SAGITTARIUS ===== in it
     */
    public void printSagittarius() {

    }


    /**
     * Your main method is the 'entry' point of the program. This always gets run
     * first. The args are arguments passed in on the command line.
     * @param args command line arguments. They are not used in this program.
     */
    public static void main(String[] args) {
        Practical1 p1 = new Practical1();  // create an object to run the methods

        p1.testMethod();  // you should comment out this line before submission

        p1.splashScreen();  // print the splash screen.
        p1.mainMenu(); // run the program

    }

    /// ----------------------- DON't MODIFY the code below this line. But you should read it. -----

    /**
     * returns a string of the main menu, so it can be printed out. This is to provide
     * uniformity across solutions. Note that \n means new line.
     * @return string of the main menu
     */
    private String getMainMenuMessage() {
        String str = "###### Main Menu ######\n";
        str += "(1) Print Business Card\n";
        str += "(2) Find Zodiac\n";
        str += "(0) Exit program\n";
        str += "Enter a number to select an option: ";
        return str;
    }

    /**
     * Uses the {@link #scanner} to grab the next line. It will then
     * parse the line as an integer. If there is an error, returns -1.
     * We use this instead of nextInt() as it is more robust.
     * @return the number or -1 is not a number
     */
    private int getClientInputAsInt() {
        String val = scanner.nextLine();
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    /**
     * Handles input from the client and then calls {@link #printZodiacCard(int, int)}
     */
    public void zodiacMenu() {
        System.out.print("Enter the month (1, 2, 3): ");
        int month = getClientInputAsInt();
        System.out.print("Enter the day: ");
        int day = getClientInputAsInt();
        printZodiacCard(month, day);
    }

    /**
     * This method takes in the month and day and determines
     * which Zodiac card to print. This is <b>not</b> the most effective way
     * to do this. It however is utilizing only techniques learned in the
     * first four weeks of classes.
     * @param month The month in a digit format (1 for jan, etc)
     * @param day the day born
     */
    public void printZodiacCard(int month, int day) {
        if (month == 1) {
            if (day <= 31) {
                if (day >= 20) {
                    printAquarius();
                    return;
                } else if (day > 0) {
                    printCapricorn();
                    return;
                }
            }
        } else if (month == 2) {
            if (day <= 29) {
                if (day >= 19) {
                    printPisces();
                    return;
                } else if (day > 0) {
                    printAquarius();
                    return;
                }
            }
        } else if (month == 3) {
            if (day <= 31) {
                if (day >= 21) {
                    printAries();
                    return;
                } else if (day > 0) {
                    printPisces();
                    return;
                }
            }
        } else if (month == 4) {
            if (day <= 30) {
                if (day >= 20) {
                    printTaurus();
                    return;
                } else if (day > 0) {
                    printAries();
                    return;
                }
            }
        } else if (month == 5) {
            if (day <= 31) {
                if (day >= 21) {
                    printGemini();
                    return;
                } else if (day > 0) {
                    printTaurus();
                    return;
                }
            }
        } else if (month == 6) {
            if (day <= 30) {
                if (day >= 21) {
                    printCancer();
                    return;
                } else if(day > 0) {
                    printGemini();
                    return;
                }
            }
        } else if (month == 7) {
            if (day <= 31) {
                if (day >= 22) {
                    printLeo();
                    return;
                } else if (day > 0) {
                    printCancer();
                    return;
                }
            }
        } else if (month == 8) {
            if (day <= 31) {
                if(day >= 23) {
                    printVirgo();
                    return;
                } else if (day > 0) {
                    printLeo();
                    return;
                }
            }
        } else if (month == 9) {
            if (day <= 30) {
                if (day >= 23) {
                    printLibra();
                    return;
                } else if (day > 0) {
                    printVirgo();
                    return;
                }
            }
        } else if (month == 10) {
            if (day <= 31) {
                if (day >= 22 ) {
                    printScorpio();
                    return;
                } else if (day > 0) {
                    printLibra();
                    return;
                }
            }
        } else if (month == 11) {
            if (day <= 30) {
                if (day >= 22) {
                    printSagittarius();
                    return;
                } else if (day > 0) {
                    printScorpio();
                    return;
                }
            }
        } else if (month == 12) {
            if (day < 31) {
                if( day >= 22) {
                    printCapricorn();
                    return;
                } else if (day > 0) {
                    printSagittarius();
                    return;
                }
            }
        }
        System.out.println();
        System.out.println("***Invalid date given***");
    }

    /**
     * for ease of printing and grading, an error message that is uniform.
     * @return a common error message.
     */
    private String getInvalidMessage() {
        return "Invalid entry. Try again.";
    }


}
