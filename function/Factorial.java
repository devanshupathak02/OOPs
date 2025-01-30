import java.util.Scanner;
public class Factorial{
    public static int Fact(int num){
        int temp=1;
        for(int i=1;i<=num;i++){
            temp=temp*i;


        }
        return temp;
        
        }
        public static int Bino(int n,int r){
        int n_fact=Fact(n);
        int r_fact=Fact(r); 
        int n_r_fact= Fact(n-r);
        int nCr= n_fact/((r_fact)*(n_r_fact));
        return nCr;    


        }
        public static boolean IsPrime(int num){
            boolean isPrime=true;
            for(int i =2;i<num;i++){
                if(num%i==0){
                     isPrime=false;

                }
            }
            return isPrime;
        }
        public static void Range(int num){
            for(int i=2;i<=num;i++){
                boolean val=IsPrime(i);
                if(val==true){
                    System.out.print(i+" ");
                }
            }
            return;
        }
        public static void main(String agrs[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter n");
            int n=sc.nextInt();
            // System.out.print("enter r");
            // int r=sc.nextInt();
            //System.out.print("the factorial is:"+Fact(a));
           // System.out.print("nCr="+Bino(n,r));
          // System.out.print(IsPrime(n));
          Range(200);

        
    }
   
}