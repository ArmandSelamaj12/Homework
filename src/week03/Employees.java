package week03;

public class Employees {

    String name;
    double salary;
    double bonus;
    double overtime;
    double hourlyPay;
    double workHours;

    public void Manager(String name, double salary, double bonus){
        salary += bonus;
        System.out.println(name + "'s salary (with bonuses): " + salary);
    }

    public void Clerk(String name, double salary, double overtime, double hourlyPay){

        salary = salary + hourlyPay * overtime;
        System.out.println(name + "'s salary (with overtime): " + salary);

    }

    public void ContractWorker(String name, double hourlyPay, double workHours){

        salary = workHours * hourlyPay;
        System.out.println(name + "'s salary: " + salary);

    }

}
