import java.util.Scanner;

public class MiniBank {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.addNewClient();
       int option;
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("Operations");
           System.out.println("1 - deposit");
           System.out.println("2 - withdraw");
           System.out.println("3 - transactions");
           System.out.println("4 - details");
           System.out.println("5 - end operation");


           option = sc.nextInt();
           switch (option){
               case 1:
                   System.out.println("deposit");
                   client.deposit();
                   break;
               case 2:
                   System.out.println("withdraw");
                   client.withdraw();
                   break;
               case 3:
                   System.out.println("           Transaction       ");
                   System.out.println("--------------------------------");
                   client.transactions();
                   break;
               case 4:
                   System.out.println("Show details");
                   client.showClientDetails();
                   break;
               case 5:
                   System.out.println("Close ");
                   break;
           }

       }while (option!=5);
    }
}
