public class compiletime{
    public static void main(String args[]){
        Calculate cal =new Calculate();
        System.out.println(cal.sum(1,4));
        System.out.println(cal.sum((float)1.50,(float)0.50));
        System.out.println(cal.sum(1,4,5));
    }
}
class Calculate{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}