import java.util.Scanner;
public class ProductFunction{
    public static int Product(int num1,int num2){
        int product=num1*num2;
        return product;
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Product(a,b));


    } 
}