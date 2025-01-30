//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1], 
//  ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   
//For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3   and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, returnthe
// index oftarget if it is in nums, or -1   if it is not in nums.You must write an 
// algorithm with O(log n) runtime complexity
import java.util.Scanner;
public class Que_2{
    public static int func(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
    return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of an array");
        int size = sc.nextInt();
        System.out.print("Enter the target");

        int target = sc.nextInt();
        
         System.out.print("enter the elements");
         int nums[]=new int[size];
         for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
         }
        int output=func(nums,target);
        if(output==-1){
            System.out.println("target does not exist");
        }else{
            System.out.println("index of target value is:"+output);
        }

    }
}