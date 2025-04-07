import java.util.*;
public class updatebit{
    public static int clearbit(int bin,int i,int num){
        
        int bitmask = ~(1<<i);
        return num & bitmask;
    }   
    public static int setbit(int bin,int i,int num){
        //0001010
        //0001011
        
        int bitmask= 1<<i;
        return num | bitmask;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bin = sc.nextInt();
        int i=sc.nextInt();
        if(bin==0){
            System.out.print(clearbit(bin , i,10));
        }else if(bin==1){
            System.out.print(setbit(bin,i,10));
        }else{
            System.out.print("0 and 1 are only acceptable");
        }
    }

}