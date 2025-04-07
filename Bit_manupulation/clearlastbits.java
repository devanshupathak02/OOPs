public class clearlastbits{
    public static int lastbits(int n,int i){
        int bitmask = ~(0) << i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.print(lastbits(7,2));
    }
}