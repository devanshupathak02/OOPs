public class Runtime{
    public static void main(String args[]){
        Deer d=new Deer();
        Animal A=new Animal();
        A.eats();
        d.eats();
    }
}
class Animal{
    void eats(){
        System.out.print("eats anything");
    }
}
class Deer extends Animal{
   void eats(){
        System.out.print("eats grass");
    }
}