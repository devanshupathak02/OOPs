public class DecBin{
    public static void Bin(int deci){
       int pow=0;
       int bin=0;
        while(deci>0){
            int rem= deci%2;
            
            int bin=bin+(rem*((int)Math.pow(10,pow)));
            pow++;
            int deci=deci/2;
        }
        System.out.print(bin);
        

    }
    public static void main(String args[]){
        Bin(10);

    }

}
