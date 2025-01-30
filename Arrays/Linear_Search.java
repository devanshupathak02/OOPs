public class Linear_Search{

    public static int Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print(i);
            }

        }    
        return -1;
    }

    public static void main(String args[]){
        int key=10;
        int array[]={2,4,6,8,10,12,14,16};
        int index=Search(array,key);
        

    }
}