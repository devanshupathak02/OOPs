import java.util.*;
public class Que3{
    public static int stock(int price[]){
        //int arr{5,1,4,8,7}      maxprofit=7-1=6
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<price.length;i++){
            for(int j=i+1;j<stock.length;j++){
           int difference= price[j]-price[i];// -4 -1 
            if(difference > max_sum){
                max_sum=difference;// //-4 -1

            }
            
        }
         return max_sum;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            System.out.println("size?");
            int size=sc.nextInt();  
             
            int price= new int[size];
            for(int i=0;i<size;i++){
                price[i]=sc.nextInt();
            }
        
        
        System.out.print(stock(price));
            //int arr[]={7,1,5,4} no profit
            //int arr{5,1,4,8,9}      maxprofit=9-1=8
        
    }
}
