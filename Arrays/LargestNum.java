import java.util.*;
public class LargestNum{
    public static void main(String args[]){
        int arr[]={2,4,5,97,5,2,5,5};
        int largestnumber=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestnumber){
                largestnumber=arr[i];
            }
        
        }
        System.out.print(largestnumber);

    }
}