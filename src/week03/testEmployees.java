package week03;

import java.util.Scanner;

public class testEmployees {
    public static void main(String[] args) {

        int choice;

        Employees e = new Employees();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Employees Salaries");
        System.out.println("1. Manager");
        System.out.println("2. Clerk");
        System.out.println("3. Contract Worker");
        System.out.println("===================");
        System.out.print("Choose: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 -> {
                System.out.print("Enter the name of the Manager: ");
                e.name = scanner.next();
                System.out.print("Enter the salary: ");
                e.salary = scanner.nextDouble();
                System.out.print("Enter the bonus: ");
                e.bonus = scanner.nextDouble();
                e.Manager(e.name, e.salary, e.bonus);
            }
            case 2 -> {
                System.out.print("Enter the name of the Clerk: ");
                e.name = scanner.next();
                System.out.print("Enter the salary: ");
                e.salary = scanner.nextDouble();
                System.out.print("Enter the overtime hours: ");
                e.overtime = scanner.nextDouble();
                if(e.overtime == 0){
                    e.Clerk(e.name, e.salary, e.overtime, e.hourlyPay);
                }
                else{
                    System.out.print("Enter the Hourly Pay of the overtime: ");
                    e.hourlyPay = scanner.nextDouble();
                    e.Clerk(e.name, e.salary, e.overtime, e.hourlyPay);
                }
            }
            case 3 -> {
                System.out.print("Enter the name of the Contract Worker: ");
                e.name = scanner.next();
                System.out.print("Enter the Hourly Pay: ");
                e.hourlyPay = scanner.nextInt();
                System.out.print("Enter the Working Hours: ");
                e.workHours = scanner.nextDouble();
                e.ContractWorker(e.name, e.hourlyPay, e.workHours);
            }
        }
    }
}
