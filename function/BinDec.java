public class BinDec{
    public static void dec(int bin){
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastdigit=bin%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bin=bin/10;
        }
        System.out.print(dec);
    }
    public static void main(String args[]){
        dec();

    }
}