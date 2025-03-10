import java.util.Scanner;// packages
import java.util.Arrays;//packages
import java.util.Collections;
public class inbuiltsort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Integer arr[]=new Integer[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,1,3, Collections.reverseOrder());//to sort the array in reverse order
        //int can't be used only Integer(it can work on object only int is premitive);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}