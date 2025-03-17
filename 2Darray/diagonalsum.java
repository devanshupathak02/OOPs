public class diagonalsum{
    public static void sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            
            sum+=matrix[i][i];
            sum+=matrix[i][matrix.length-i-1];

                // if(i==j){
                //     sum+=matrix[i][j];
                // }
                // else if(i+j==matrix.length-1){
                //     sum+=matrix[i][j];
                // }
            
        }
       
      
        
        System.out.print(sum);
       
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},    
                        {9,10,11,12},
                        {13,14,15,16}};
                        sum(matrix);
    }
}