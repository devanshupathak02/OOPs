//Given an integer array nums, return true if any value appears at least twice
// in the array, and return false if every element is distinct
import java.util.Scanner;
public class Ass1{
    public static boolean function(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
                
                
            }
        }
        return false;
        
    }
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        
        System.out.println(function(nums));
       
    }
}