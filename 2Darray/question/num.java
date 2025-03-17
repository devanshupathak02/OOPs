public class num{
    public static void transpose(int input[][]){
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                System.out.print(input[j][i]);
            }
            System.out.println();
        }


    }
    public static void sum(int input[][]){
        int sum=0;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                if(i==1){
                        sum+=input[i][j];
                }
                
            }
        }
        System.out.print(sum);
    }
    public static void nums(int input[][]){
        int key=7;
        int count=0;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                if(key==input[i][j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        //no. of 7's:
        int input[][]={{4,7,8},
                       {8,8,7},
                       {7,7,7}};
       // nums(input);
       // sum(input);
       transpose(input);

    }
}