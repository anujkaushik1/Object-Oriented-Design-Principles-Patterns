package Inheritance;

public class SingleInheritance {

    public static void main(String args[]){

        Male alpha = new Male();
        alpha.sleep();

    }

}

class Human {
    int age;
    int weight;


    // default constructor

    // No-arg Constructor

    public Human() {
        System.out.println("Inside the constructor");
    }

    // Paramterized Constructor
    public Human(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    // Constructor Overloading
    public Human(int age){
        this.age = age;
    }

    // behaviour
    void sleep(){
        System.out.println("Human is sleeping");
    }
    void eat(){
        System.out.println("Human is eating");
    }
}

class Male extends Human {

}

