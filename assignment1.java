import java.util.*;
public class assignment1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
       /* float num1= sc.nextInt();
        float num2= sc.nextInt();
        float num3= sc.nextInt();
        float avg= (num1+num2+num3)/3;
        System.out.print(avg);
        */


      /* float num1 = sc.nextFloat();
       float sq= num1*num1;
       System.out.print(sq);
       */
        System.out.println("enter the rate of pencil");
        float pencil=sc.nextFloat();
        System.out.println("enter the rate of pen");
        float pen=sc.nextFloat();
        System.out.println("enter the rate of eraser");
        float eraser=sc.nextFloat();
         float total = pen+pencil+eraser;
         System.out.println("total of item:" +total);
         float gst = (total*18)/100;
         System.out.println("gst amount:"+ gst);
         float tbill= gst+total;
         System.out.println("total amount with gst is:"+ tbill);



    }
}