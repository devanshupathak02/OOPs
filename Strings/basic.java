// java has String as a class
// String in java are immutable means it want changes in the string value then we have to take new variable
import java.util.*;
public class basic{
    public static void print(String fname){
        for(int i=0;i<fname.length();i++){
        System.out.print(fname.charAt(i));
        }
    }
    public static void main( String args[]){
        // char arr[]={'a','b','c'};
        // String str="abbc";
        // String str2=new String("XYZ");
        // //both the methods are correct to declear string
         Scanner sc=new Scanner(System.in);
        // String str5=sc.next();
        // String str6=sc.nextLine();//this is used to print the complete line 
        // System.out.print(str6);
        
        
        //length is a function in String class but is property in array

        String fname="deva anshu";
       // System.out.print(name.length()); //length()is used 
        print(fname);
    }

} 