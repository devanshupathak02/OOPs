import java.util.*;
public class Function{
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");


}
    public static int printsum(int num1,int num2){
       
        int sum =num1+num2;
        return sum;
    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        // int add=printsum(a,b);
        // System.out.print(add);
       System.out.print(printsum(a,b)) ;
    //printhelloworld();
   
}
}