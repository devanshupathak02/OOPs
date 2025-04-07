public class clearbit{
    public static int clearbit(int n,int i){
    // 00 1 010
    int bitmask= ~(1<<i);
    return n & bitmask;
    }

public static void main(String args[]){
    System.out.print(clearbit(10 ,1));
}
}