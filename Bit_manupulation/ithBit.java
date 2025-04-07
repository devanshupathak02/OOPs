public class ithBit{
    public static int ithbit(int i,int n){
        //10110
        int bitmask=n >> i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.print(ithbit(2,15));
    } 
}