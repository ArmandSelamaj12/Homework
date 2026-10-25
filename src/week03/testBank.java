package week03;

import java.util.Scanner;

public class testBank {
    public static void main(String[] args){

        BankAccount t = new BankAccount(100);
        Scanner scanner = new Scanner(System.in);

        int choice = 1;
        double withdrawAmount;
        double depositAmount;

        while (choice != 0){
            System.out.println("===============");
            System.out.println("1. Show Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("0. Exit");
            System.out.println("===============");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> t.showBalance();
                case 2 -> {
                    System.out.print("Enter the amount you want to withdraw: ");
                    withdrawAmount = scanner.nextDouble();
                    t.withdrawMoney(withdrawAmount);
                }
                case 3 -> {
                    System.out.print("Enter the amount you want to deposit: ");
                    depositAmount = scanner.nextDouble();
                    t.depositMoney(depositAmount);
                }
                case 0 -> System.out.println("Bye!");
            }
        }


    }
}
