import java.util.*;
public class search{
    public static int largest(int matrix[][]){
        //int let_num=Integer.MIN_VALUE;
        int largest_num=matrix[0][0];
        int maxrow=0,maxcol=0;
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
               
               // if(let_num<matrix[i][j]){
               if(largest_num<matrix[i][j]){
                   // let_num=matrix[i][j];
                    largest_num=matrix[i][j];
                    maxrow=i;
                    maxcol=j;
                    
                }
               
            }
            
        }
         System.out.println("largest num is:" + /* let_num */largest_num ) ;
         System.out.println("largest num index is:" + maxrow +","+maxcol) ;
       
        
       

        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of rows");
        int row=sc.nextInt();
        System.out.print("enter the no. of column");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        largest(matrix);

        
    }

}