public class oddeven{
    public static void main(String args[]){
        int bitmask=1;
        int n=98;
        if((n & bitmask)==0){
            System.out.print("n is even ");
        }else{
            System.out.print("n is odd");
        }
        
    }
}