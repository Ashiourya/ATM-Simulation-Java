import java.util.*;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("------ Welcome to ATM ------");
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if (!atm.validateUser(acc, pin)) {
            System.out.println("Invalid Credentials! Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n------ ATM Menu ------");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance: ₹" + atm.getBalance(acc));
                    break;

                case 2:
                    System.out.print("Enter amount to Withdraw: ");
                    double w = sc.nextDouble();
                    atm.withdraw(acc, w);
                    break;

                case 3:
                    System.out.print("Enter amount to Deposit: ");
                    double d = sc.nextDouble();
                    atm.deposit(acc, d);
                    break;

                case 4:
                    System.out.println("Thank You for Using ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

