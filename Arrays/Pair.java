public class Pair{
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int var=arr[j];
            System.out.print("("+current + "," +var +")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        pair(arr);
        
    }
}