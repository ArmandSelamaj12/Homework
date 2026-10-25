package week03;

public class BankAccount {

    private double amount;

    public BankAccount(double amount){
        this.amount = amount;
    }

    public void showBalance(){
        System.out.println("Balance: " + amount);
    }

    public void withdrawMoney(double withdrawAmount){
        if (withdrawAmount < 0) {
            System.out.println("Withdrawal amount can't be negative");

        } else if (amount == 0) {
            System.out.println("Your balance is 0");

        } else if (withdrawAmount > amount) {
            System.out.println("Withdrawal amount can't be larger than the amount you have ");

        } else {
            amount -= withdrawAmount;
            System.out.println("Withdrawal successful");
        }
    }

    public void depositMoney(double depositAmount){
        if (depositAmount == 0){
            System.out.println("Your deposit amount can't be 0");
        }
        else if(depositAmount < 0){
            System.out.println("You deposit amount can't be negative");
        }
        else{
            amount += depositAmount;
            System.out.println("Successful deposit");
        }
    }


}
