import java.util.*;
public class anagram{
    public static void anagram(String str1, String str2){
        //1- race
        //2- care
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char str_arr1[]=str1.toCharArray();
            char str_arr2[]=str2.toCharArray();
            // sort the array
            Arrays.sort(str_arr1);
            Arrays.sort(str_arr2);
            boolean result =Arrays.equals(str_arr1,str_arr2);
            if(result){
                System.out.print("words are anagram");
            }
            else{
                System.out.print("words are not are anagram");
            }
        }    
        else{
            System.out.print("length is not equal");
        }    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        anagram(str1,str2);
    }
}