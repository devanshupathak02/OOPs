import java.util.*;
public class Array{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String args[]){
        // int num[]=new int[50];
        // int random[]={1,2,3,4};
        // String st[]={"apple","banana","mango"};
        // int marks[]=new int[50];
        // Scanner sc= new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[3]=sc.nextInt();
        //     System.out.println("phy :"+ marks[0]);
        //     System.out.println("chm :"+ marks[1]);
        //      System.out.println("math :"+ marks[2]);
           
        int marks[]={80,90,90};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
}