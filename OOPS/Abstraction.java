public class Abstraction{
    public static void main(String args[]){
        Mustang h=new Mustang();
        
        
    }
}
abstract class Animal{
    String color;
    Animal(){
           System.out.print("animal constructor");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void legs();
}
class Horse extends Animal{
    Horse(){
         System.out.print("Horse constructor");
    }
    void changecolor(){
        color="red";
    }
    void legs(){
        System.out.print("4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
         System.out.print("mustang constructor");
    }
}
class Chicken extends Animal{
    void legs(){
        System.out.print("2 legs");
    }
    void changecolor(){
        color="black";
    }
}