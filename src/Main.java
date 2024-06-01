import java.util.Scanner;
public class Main {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
atm object=new atm();
object.checkpin();

    }
}

    class atm {
        float balance;
        int pin=1234;
        float amount;
        Scanner scanner=new Scanner(System.in);
        public void checkpin() {
            System.out.println("Enter Your correct PIN:");
            int enterpin = scanner.nextInt();
            if (enterpin == pin) {
                menu();

            } else {
                System.out.println("Invalid PIN:");
                checkpin();
            }
        }

        public void menu() {
            System.out.println("Enter your choice: ");
            System.out.println("1.Check A/C balance");
            System.out.println("2.Withdraw money");
            System.out.println("3.Deposit money");
            System.out.println("4.EXIT");
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkbalance();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    deposit();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Try again:");
                    break;
            }

        }

        public void checkbalance() {
            System.out.println("Balace:" + balance);
            menu();
        }

        public void withdraw() {
            System.out.println("Enter the amount:");
            float amount = scanner.nextFloat();
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Money withdrawl successfull");
                menu();

            }
        }

        public void deposit() {
            System.out.println("Enter amount for deposit");
            amount = scanner.nextFloat();
            balance = balance + amount;
            System.out.println("successfull");
            menu();

        }
    }
