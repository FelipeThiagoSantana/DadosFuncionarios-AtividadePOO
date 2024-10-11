import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double percentage;

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        //Nome Funcionario
        System.out.println("Enter worker name");
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.println();


        //Salario bruto
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.println();

        //Imposto
        System.out.print("Enter Salary without discounts: ");
        employee.Tax = scanner.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee);

        System.out.println("Which percetage to increase salary?");
        percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();

        System.out.println("Updated data: " + employee);






    }
}