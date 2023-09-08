import java.util.Objects;
import java.util.Scanner;

public class ATM extends Account{

    public void Withdraw(double amount){
        if(amount>balance) {
            System.out.println("Insufficient Balance");
        }else {
            balance -= amount;
            System.out.println("Collect your cash and take your card.");
        }
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount is submitted.");
    }

    public void checkBalance(){
        System.out.println("Your balance is: "+balance);
    }

    public static void main(String[] args) {

        ATM atm = new ATM();

        double amount;
        int choice;
        String account_number;
        String account_pin;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        account_number=scanner.nextLine();
        System.out.println("Enter Pin: ");
        account_pin=scanner.nextLine();

        while(Objects.equals(account_number, atm.user_account) && Objects.equals(account_pin,atm.pin)) {
            System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
            System.out.println("Enter the Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the amount: ");
                    amount = scanner.nextDouble();
                    atm.Withdraw(amount);
                }
                case 2 -> {
                    System.out.println("Enter the Amount: ");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                }
                case 3 -> atm.checkBalance();
                case 4 ->System.exit(0);
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}