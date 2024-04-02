import java.util.Scanner;
import edu.clibank.bank.*;

public class CLIBank {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to CLIBank, where your code becomes money. Create your account below:");
        System.out.println("Insert your name: ");
        String name = scan.next();
        System.out.println("Hello, " + name + ". Now, please insert your agency number");
        String agency = scan.next();
        System.out.println("Your agency is #" + agency);
        System.out.println("Now, please provide us with your account number.");
        int accountNumber = scan.nextInt();
        System.out.println("Great! Now, how much is your initial deposit?");
        double funds = scan.nextDouble();

        Bank bank = new Bank(name, funds, accountNumber, agency);

        System.out.println("You've sucessfully created your account " + bank.getUser() + "!");
        System.out.println("You have U$" + bank.getFunds());
        System.out.println("Your account info is:");
        System.out.println("Agency: " + bank.getAgency());
        System.out.println("Account number: " + bank.getAccountNumber());
        String moreTransations = "y";
        while (moreTransations.toLowerCase().equals("y")) {
            System.out.println("Do you want to make any other transaction? [Y/n]");
            moreTransations = scan.next();
            if (!moreTransations.toLowerCase().equals("y"))
                break;
            System.out.println("Type the transaction you want to do: \n1- Deposit \n2- Withdraw");
            int transaction = scan.nextInt();
            if (transaction > 2 || transaction < 1) {
                System.out.println("Not a valid transaction. ");
            } else if (transaction == 1) {
                System.out.println("Please, insert the amout you wish to deposit.");
                double amount = scan.nextDouble();
                bank.deposit(amount);
            } else {
                System.out.println("Please, insert the amout you wish to withdraw.");
                double amount = scan.nextDouble();
                bank.withdraw(amount);
            }
        }
        scan.close();
    }
}
