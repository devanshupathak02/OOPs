public class setithBit{
    public static int setbit(int n,int i){
        // 00001 0 10
        int bitmask= 1<<i;
        return (n | bitmask);
    }
    public static void main(String args[]){
        System.out.print(setbit(10,2));
    }
}