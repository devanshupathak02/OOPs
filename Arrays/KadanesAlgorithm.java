import java.util.*;
public class KadanesAlgorithm{
    public static void ksubarray(int arr[]){
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
             current_sum += arr[i];
            if(current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(current_sum,max_sum);// it will compare current sum with max some and print the largest no.


        }
        System.out.print("max subarray sum is:"+ max_sum);

    }
    public static void main(String args[]){
        int arr[]={-1,2,4,-5,4,2};
        ksubarray(arr);

    }
}

