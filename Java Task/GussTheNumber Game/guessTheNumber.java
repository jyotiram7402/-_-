
//Created By Jyotiram Kamble As Task 2 of Java Development Intership of Oasis Infobyte

import java.util.*;

public class guessTheNumber {
    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(System.in)) {

            int mynum = (int) (Math.random() * 100);

            int userNumber = 0;

            do {

                System.out.print("Guess my number (1 to 100): ");
                userNumber = sc.nextInt();

                if (userNumber == mynum) {
                    System.out.println("YEHHH!!! CORRECT NUMBER!!!");
                    break;
                }

                else if (userNumber > mynum) {
                    System.out.println("Your number is too large!");
                }

                else if (userNumber < mynum) {
                    System.out.println("Your number is too small!");
                }

                else {
                    System.out.println("WRONG INPUT!!!!");
                }

            } while (true);

            System.out.println("My Number was: " + mynum);
        }

        System.out.println("\n");
    }
}