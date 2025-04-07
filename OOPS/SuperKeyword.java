public class SuperKeyword{
    public static void main(String args[]){
        Horse h=new Horse();
        
    }
}
class Animal{
    Animal(){
        System.out.println("this is animal constructor");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("this is Horse constructor");
    }
}