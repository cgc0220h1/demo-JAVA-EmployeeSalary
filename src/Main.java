import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee of the month: ");
        Employee nam = new Employee(1,"Nam", "Nguyen", 500);
        System.out.println(nam.toString() + "$");
        System.out.println("Annual Salary: " + nam.getAnnualSalary() + "$");
        System.out.println("Upto: " + nam.upToSalary(20) + "$");
    }
}
