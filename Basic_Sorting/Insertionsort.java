import java.util.Scanner;
public class Insertionsort{
    public static void insertionsort(int arr[],int size){
        for(int i=1;i<size;i++){  // n=5 {4 2 1 5 3}
            int curr=arr[i];//2
            int prev=i-1;//[0]
            //finding correct pos to insert
            while(prev>=0 && arr[prev]>curr){//true
                arr[prev+1]=arr[prev];
                prev--;
            }
           // insertion
           arr[prev+1]=curr;


        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr,size);
    }
}