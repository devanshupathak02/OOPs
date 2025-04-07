public class checkpow2{
    public static boolean check(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.print(check(7));
    }
}
// incomplete bit manupulation