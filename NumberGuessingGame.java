import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static void easyLevel() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rnum = rand.nextInt(10);

        System.out.println("\nRules:");
        System.out.println("  --> Guess a number between 0 and 9.");
        System.out.println("  --> Type '1234' to reveal the answer and exit.");

        while (true) {
            System.out.print("\nEnter your guess: ");
            int input = scan.nextInt();

            if (input == rnum) {
                System.out.println("Congrats! You guessed the correct number (^.^)");
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (input == 1234) {
                System.out.println("The random number was: " + rnum);
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (Math.abs(rnum - input) <= 3) {
                System.out.println("You're close to the correct number!");
            } else {
                System.out.println("You're not close to the correct number.");
            }
        }
    }

    static void mediumLevel() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rnum = rand.nextInt(100);

        System.out.println("\nRules:");
        System.out.println("  --> Guess a number between 0 and 99.");
        System.out.println("  --> Type '1234' to reveal the answer and exit.");

        while (true) {
            System.out.print("\nEnter your guess: ");
            int input = scan.nextInt();

            if (input == rnum) {
                System.out.println("Congrats! You guessed the correct number (^.^)");
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (input == 1234) {
                System.out.println("The random number was: " + rnum);
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (Math.abs(rnum - input) <= 10) {
                System.out.println("You're close to the correct number!");
            } else {
                System.out.println("You're not close to the correct number.");
            }
        }
    }

    static void hardLevel() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rnum = rand.nextInt(1000);

        System.out.println("\nRules:");
        System.out.println("  --> Guess a number between 0 and 999.");
        System.out.println("  --> Type '1234' to reveal the answer and exit.");

        while (true) {
            System.out.print("\nEnter your guess: ");
            int input = scan.nextInt();

            if (input == rnum) {
                System.out.println("Congrats! You guessed the correct number (^.^)");
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (input == 1234) {
                System.out.println("The random number was: " + rnum);
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (Math.abs(rnum - input) <= 50) {
                System.out.println("You're close to the correct number!");
            } else {
                System.out.println("You're not close to the correct number.");
            }
        }
    }

    static void customLevel() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("\nEnter the starting number: ");
        int start = scan.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scan.nextInt();

        System.out.print("Enter the close range value: ");
        int range = scan.nextInt();

        int rnum = rand.nextInt(end - start + 1) + start;

        System.out.println("\nRules:");
        System.out.println("  --> Guess a number between " + start + " and " + end + ".");
        System.out.println("  --> Type '1234' to reveal the answer and exit.");

        while (true) {
            System.out.print("\nEnter your guess: ");
            int input = scan.nextInt();

            if (input == rnum) {
                System.out.println("Congrats! You guessed the correct number (^.^)");
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (input == 1234) {
                System.out.println("The random number was: " + rnum);
                System.out.println("\n=== Game Ended! ===");
                break;
            } else if (Math.abs(rnum - input) <= range) {
                System.out.println("You're close to the correct number!");
            } else {
                System.out.println("You're not close to the correct number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("~`~`~`~`~ WELCOME TO THE NUMBER GUESSING GAME ~`~`~`~`~");

        System.out.println("\n==== Choose a Difficulty Level ====");
        System.out.println("  1. Easy");
        System.out.println("  2. Medium");
        System.out.println("  3. Hard");
        System.out.println("  4. Custom");

        System.out.print("\nEnter your chosen level: ");
        String lvl = get.nextLine().trim();

        System.out.println("\n=== Game Started (^.^) ===");

        switch (lvl.toLowerCase()) {
            case "easy":
                easyLevel();
                break;
            case "medium":
                mediumLevel();
                break;
            case "hard":
                hardLevel();
                break;
            case "custom":
                customLevel();
                break;
            default:
                System.out.println("Please choose a valid level (Easy, Medium, Hard, or Custom).");
        }
    }
}
