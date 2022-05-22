package Inheritance;

public class HierarchicalInheritance {

    public static void main(String[] args) {
        FullTime ft = new FullTime();
        ft.work();

        Intern in = new Intern();
        in.work();
    }
}

class Employee {

    public Employee(){
        System.out.println("Employee Constructor");
    }

    void work(){
        System.out.println("Employee is working");
    }
}

class Intern extends Employee {
    public Intern(){
        System.out.println("Intern Constructor");
    }
}

class FullTime extends Employee{
    public FullTime(){
        System.out.println("Full Time Constructor");
    }
}
