import entities.Worker;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();

        //Nome Funcionario
        System.out.println("Enter worker name");
        System.out.print("Name: ");
        worker.name = scanner.nextLine();
        System.out.println();


        //Salario bruto
        System.out.print("Enter Salary without discounts: ");
        worker.grossSalary = scanner.nextDouble();
        System.out.println();

        //Imposto
        System.out.print("Enter Salary without discounts: ");
        worker.Tax = scanner.nextDouble();
        System.out.println();


    }
}