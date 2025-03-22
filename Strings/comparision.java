//string equality is proved using ".equals"
public class comparision{
    public static void main(String args[]){
        String str1="deva";
        String str2="deva";
        String str3= new String("deva");
        if(str1==str2){
            System.out.print("equal");
        }else{
            System.out.print("not equal");
        }
         if(str1==str3){
            System.out.print("equal");
        }else{
            System.out.print("not equal");
        }
        if(str1.equals(str2)&& str1.equals(str3)){ //it only check the vlaues at the lowest level
            System.out.print("both equals");
        }
        
    }
}