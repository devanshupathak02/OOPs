import java.util.*;
public class BruteForce{
    public static void subarraysum(int arr[]){
        int maxvalue=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int cursum=0;
                for(int k=start;k<=end;k++){
                    cursum += arr[k];
                    
                }
                System.out.println(cursum);
                if(cursum>maxvalue){
                    maxvalue=cursum;
                }
           
            }
        }
        System.out.println("max sum"+ maxvalue);

    }
   
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6};
        subarraysum(arr);
    }

}