public class sortedmatrixsearch{
    public static boolean search(int matrix[][],int key){
       int row=0,endcol=matrix[0].length-1;

        while(row<matrix.length && endcol>=0 ){
            if(matrix[row][endcol]==key){
                System.out.print("found key at" +"("+row+","+endcol+")");
                return true;
            }
            else if(key<matrix[row][endcol]){
                endcol--;
            }
            else{
                row++;
            }
            
        }
        System.out.print("key not found");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,20,25,30},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        search(matrix,key);
    }

}