package Inheritance;

public class MultiLevelInheritance {

    public static void main(String args[]){

        Scorpio fav = new Scorpio();
        fav.intro();
    }
}

class Car {
    String color;
    int weight;

    public Car(){
        System.out.println("Car constructor");
    }
    void run(){
        System.out.println("Car is running");
    }

    void brake(){
        System.out.println("Car can apply brake");
    }
}

class Mahindra extends Car {
    int rating;

    public Mahindra(){
        System.out.println("Mahindra Constructor");
    }
    void intro(){
        System.out.println("This is Mahindra");
    }
}

class Scorpio extends Mahindra {
    public Scorpio(){
        System.out.println("Scorpio Constructor");
    }
}