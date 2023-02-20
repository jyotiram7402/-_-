//Created By Jyotiram Kamble As Task 1 of Java Development Intership of Oasis Infobyte

import java.util.Scanner;

class ATM {
    int pin = 123456;
    float balance;

    public void checkPin() {
        System.out.println("Enter the Pin");
        try (Scanner sc = new Scanner(System.in)) {
            int checkpin = sc.nextInt();

            if (checkpin == pin) {
                menu();

            } else {
                System.out.println("Enter a valid pin");

            }
        }

    }

    public void menu() {
        System.out.println("Entre Your Choice Option");
        System.out.println("1.Check balance");
        System.out.println("2.withdrawal Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Exist");

        try (Scanner sc = new Scanner(System.in)) {
            int Choice = sc.nextInt();

            switch (Choice) {

                case 1:
                    check_Balnce();
                    break;
                case 2:
                    withwdral_Amount();
                    break;
                case 3:
                    deposit_Amount();
                    break;
                case 4:
                    Exist();
                    break;

                default:
                    System.out.println("Enter Valid Choice");
                    menu();
                    break;
            }
        }

    }

    public void check_Balnce() {

        System.out.println("Account balance is : " + balance);
        menu();
    }

    public void withwdral_Amount() {
        System.out.println("Enter Amont To Be withdrawal");

        try (Scanner Sc = new Scanner(System.in)) {
            int amountwith = Sc.nextInt();
            if (amountwith > balance) {
                System.out.println(" balance is not sufficient ");
            } else {
                balance = balance - amountwith;
                System.out.println("Amout withdrawal Succefuly");

            }
            menu();
        }

    }

    public void deposit_Amount() {
        System.out.println("Enter Amount to be Deposit");
        try (Scanner sc = new Scanner(System.in)) {
            int amount = sc.nextInt();
            balance = balance + amount;

            System.out.println("Enter Amount to be Deposit succefulyy");
            menu();
        }
    }

    public void Exist() {
        return;
    }
}

public class ATM_Interface {
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkPin();
    }

}