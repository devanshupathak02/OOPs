import java.util.*;
public class uppercase{
    public static String touppercase(String str){
        StringBuilder nstr=new StringBuilder("");
        
        char ch=Character.toUpperCase(str.charAt(0));
        nstr.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){// h e l l o _
                nstr.append(str.charAt(i));
                i++;
                nstr.append(Character.toUpperCase(str.charAt(i)));

            }else{
                nstr.append(str.charAt(i));
            }
        }
       return nstr.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       System.out.print(touppercase(str));    
    }
}