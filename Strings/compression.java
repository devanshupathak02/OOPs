import java.util.*;
public class compression{
    public static String compress(String str){
        // aabcccddd
        String strnew="";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            strnew+= str.charAt(i);
            if(count>1){
                strnew += count.toString();
            }
            
        }
        return strnew;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next(); 
        System.out.print(compress(str));
    }
}