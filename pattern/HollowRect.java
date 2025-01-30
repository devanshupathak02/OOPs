
// ****
// *  *
// *  *
// ****
public class HollowRect{
    public static void hollow_Rectangle(int row,int column){
       //outer loop
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||j==1||i==row||j==column)
                {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_Rectangle(4,4);
        
    }
}