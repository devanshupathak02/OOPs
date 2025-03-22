public class substring{
    public static String substring(String str){
        String sstring="";
        int start=0;
        int end=8;
        for(int i=start;i<end;i++){
            sstring+=str.charAt(i);
            
        }
        return(sstring);
    }
    public static void main(String args[]){
        String str= "hello world";
       System.out.print(str.substring(0,9));
       //System.out.print(substring(str));
    }
}