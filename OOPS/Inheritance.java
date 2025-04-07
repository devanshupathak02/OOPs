public class Inheritance{
    public static void main(String args[]){
        Fish shark= new Fish();
        Dog cheems =new Dog();
        cheems.color="blue";
        cheems.eats();
        cheems.legs= 4;
        shark.eats();
        System.out.print(cheems.legs);
    }
}
//base class
class Animal{
    String color;
    void eats(){
        System.out.print("eaats");
    }
    void breath(){
        System.out.print("breath");
    }
}

class Mammal extends Animal{
    String name;
    int legs;
}
class Dog extends Mammal{
    String breed;
}
/*class Fish extends Animal{       // "extends" keyword is used to inherite parent class
    int fins;
    void swim(){
        System.out.print("swims");
    }

}*/