
//     *
//    **
//   ***
//  ****  
public class Inverted{
    public static void invertedstar(int row ,int column){
        for(int i=1;i<=row;i++){
           // spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void InvertedWithNumber(int row){
        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i;j++)
            {
            System.out.print(j);
            }
             System.out.println();
        }
       
    } 
    public static void FloydsTriangle(int row){
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    public static void bin(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                System.out.print("0");
            }
            System.out.println();
        }

    }
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

    }
    }
    public static void Rhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //boundary
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void main(String args[]){
        //invertedstar(4,4);
        InvertedWithNumber(5);
        //FloydsTriangle(5);
        //bin(5);
        //Butterfly(4);
        //Rhombus(5);
        //Hollow_rhombus(5);
        //Diamond(4);
    }
}