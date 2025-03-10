import java.util.*;
public class Selectionsort{
    public static void selection(int arr[],int size){
        for(int i=0;i<arr.length-1;i++){ //n=5 {5,4,2,1,3}
        int minnum=i;//lets assume small no. is on index 0
        for(int j=i+1;j<arr.length;j++){
            if(arr[minnum]>arr[j]){
                minnum=j;
            }
        }//swap
        int temp=arr[minnum];
        arr[minnum]=arr[i];
        arr[i]=temp;
        }

    }
    public static void printarr( int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr,size);
        printarr(arr,size);

    }
}