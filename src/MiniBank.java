import java.util.ArrayList;
import java.util.Scanner;

public class MiniBank {
    private static ArrayList<BankAccount> clients;
    public static void main(String[] args) {
        clients = new ArrayList<BankAccount>();
        BankAccount client = new BankAccount();
        client.addNewClient();
        clients.add(client);
       int option;
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("---------------------------------");
           System.out.println("Operations");
           System.out.println("---------------------------------");
           System.out.println("1 - Deposit Money");
           System.out.println("2 - Withdraw Money");
           System.out.println("3 - Transactions ");
           System.out.println("4 - Show All Clients");
           System.out.println("5 - New Account ");
           System.out.println("6 - End Operation ");
           System.out.println("---------------------------------");
           boolean searchResult = false;
           int accountNo;

           option = sc.nextInt();
           switch (option){
               case 1:
                   System.out.println("deposit");
                   System.out.println("Enter account number to deposit : \n");
                   accountNo = sc.nextInt();
                   for (int i = 0; i < clients.size(); i++){
                       searchResult = clients.get(i).findClient(accountNo);
                       if(searchResult){
                           clients.get(i).deposit();
                           break;
                       }
                   }
                   if(!searchResult){
                       System.out.println("No account in our bank matches to this account number !");
                   }
                   break;
               case 2:
                   System.out.println("withdraw");
                   System.out.println("Enter account number to withdraw : \n");
                   accountNo = sc.nextInt();
                   for (int i = 0; i < clients.size(); i++){
                       searchResult = clients.get(i).findClient(accountNo);
                       if(searchResult){
                           clients.get(i).withdraw();
                           break;
                       }
                   }
                   if(!searchResult){
                       System.out.println("No account in our bank matches to this account number !");
                   }
                   break;
               case 3:
                   System.out.println("Transactions");
                   System.out.println("=================================");
                   System.out.println("Enter account number to show transactions : \n");
                   accountNo = sc.nextInt();
                   for (int i = 0; i < clients.size(); i++){
                       searchResult = clients.get(i).findClient(accountNo);
                       if(searchResult){
                           clients.get(i).showClientDetails();
                           clients.get(i).transactions();
                           break;
                       }
                   }
                   if(!searchResult){
                       System.out.println("No account in our bank matches to this account number !");
                   }
                   break;
               case 4:
                   System.out.println("Show all clients");
                   System.out.println("=================================");
                   for (int i = 0; i < clients.size(); i++) {
                       clients.get(i).showClientDetails();
                   }
                   break;
               case 5:
                   System.out.println("Open new account");
                   BankAccount newClient = new BankAccount();
                   newClient.addNewClient();
                   clients.add(newClient);
                   break;
               case 6:
                   System.out.println("Close ");
                   break;
           }
       }while (option!=6);
    }
}
