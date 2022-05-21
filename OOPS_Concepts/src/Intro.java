public class Intro {
     
    public static void main(String args[]){
        Human obj = new Human(10, 78);
        System.out.println("age is " + obj.age);
    }

}

class Human{
    // properties
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