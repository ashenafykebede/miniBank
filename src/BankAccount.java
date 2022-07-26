import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String clientName;
    private int accountNumber;
    private double balance;
    private ArrayList<Double> transactions;

    Scanner scan = new Scanner(System.in);

    public BankAccount() {
        this.accountNumber = new Random().nextInt(999999) + 100000;
        this.balance = 0.0;
        this.transactions = new ArrayList<Double>();
    }

    public void addNewClient() {
        System.out.println("Enter your name \n");
        this.clientName = scan.nextLine();
        System.out.println("Bank account opened!");
    }

    public void showClientDetails() {
        System.out.println("Name : " + clientName);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit() {
        System.out.println("Enter deposit amount: \n");
        double amount = scan.nextDouble();
        this.balance += amount;
        transactions.add(amount);
    }

    public void withdraw() {
        System.out.println("Enter withdrawal amount: \n");
        double amount = scan.nextDouble();
        if (balance >= amount) {
            this.balance -= amount;
            transactions.add(-amount);
        } else {
            System.out.println("Not enough balance !");
        }
    }

    public void transactions() {
        String trans;
        for (Double i : transactions) {
            trans = i > 0 ? "deposited " + i : "withdrawn " + i;
            System.out.println(trans);
        }
        System.out.println("--------------------------------");
        System.out.println("Current balance : " + balance);
        System.out.println("--------------------------------");
    }

    public boolean findClient() {
        System.out.println("Enter account number to search : \n");
        int accountNo = scan.nextInt();
        if (accountNumber==accountNo) {
            showClientDetails();
            return true;
        }
        return false;
    }
}
