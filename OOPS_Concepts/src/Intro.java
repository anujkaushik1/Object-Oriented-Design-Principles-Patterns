public class Intro {

    public static void main(String args[]){
        Human obj = new Human(10, 78);
        System.out.println("age is " + obj.age);

        System.out.println("Number of object created " + Human.count);
    }

}

class Human{
    // properties
    int age;
    int weight;

    static int count;

    // default constructor

    // No-arg Constructor

    public Human() {
        this(10);
        count++;
        System.out.println("Inside the constructor");
    }

    // Paramterized Constructor
    public Human(int age, int weight){
        this();
        count++;
        this.age = age;
        this.weight = weight;
    }

    // Constructor Overloading
    public Human(int age){
        count++;
        this.age = age;
    }

    // behaviour
    void sleep(){
        System.out.println("Human is sleeping");
    }
    void eat(){
        System.out.println("Human is eating");
    }

    static void update(){
        count++;
    }
}