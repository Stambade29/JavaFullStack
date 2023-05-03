import java.util.Scanner;

public class Bankaccountmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get account details from user
        System.out.println("Enter account number: ");
        int accNo = sc.nextInt();
       
        
        System.out.println("Enter customer name: ");
        String custName = sc.nextLine();
        
        System.out.println("Enter account type (Savings/Current): ");
        String accType = sc.nextLine();
        
        System.out.println("Enter initial balance: ");
        float balance = sc.nextFloat();
        
        // Create BankAccount object and handle exceptions
        try {
            Bankaccount account = new Bankaccount();
            
            // Perform transactions
            account.deposit(500);
            account.withdraw(2000);
            account.withdraw(1000);
            
            // Print current balance
            System.out.println("Current balance: " + account.getBalance());
        } catch (NegativeAmountException  e) {
            System.out.println("Error: Amount cannot be negative");
        } catch (InsufficientFunds | LowBalanceException e) {
            System.out.println("Error: " + e);
        }
        
        
    }
}

