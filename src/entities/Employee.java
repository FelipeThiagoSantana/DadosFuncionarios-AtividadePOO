package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double Tax;
    public double percentage;

    public double netSlaray(){
        return grossSalary - Tax;
    }

    public void increaseSalary (double percentage){
       double updated = grossSalary * (percentage / 100);

       grossSalary += updated;

    }


    public String toString(){
        return name
                + ", $"
                +String.format("%.2f", netSlaray());



    }

}
