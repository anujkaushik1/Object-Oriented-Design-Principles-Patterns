public class Intro {

    public static void main(String args[]){
        Human obj = new Human();
        obj.age = 21;
        obj.weight = 78;
        obj.sleep();
    }

}

class Human{
    // properties
    int age;
    int weight;

    // behaviour
    void sleep(){
        System.out.println("Human is sleeping");
    }
    void eat(){
        System.out.println("Human is eating");
    }
}