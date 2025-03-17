import java.util.*;
public class matrix{
    public static boolean search(int matrix[][],int n,int m,int key){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("key is at index:" + i +","+ j);
                    return true;
                }
                    
                     
                
            }
        }
        System.out.print("key does not exist");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter key");
        int key=sc.nextInt();
        System.out.print("enter matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,n,m,key);
    
    }

}