import java.util.*;
public class BubbleSort{
    public static void bubblesort(int arr[],int size)
    {
        for(int turn=0;turn<size-1;turn++) { //n=5 {5,4,3,2,1}
            for(int j=0;j<size-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }     
            
        }
    }
    
    
    public static void printarr(int arr[],int size)
    {
        for(int i=0;i<size;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    
        
        
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("enetr the size of an array : ");
		int size= sc.nextInt();
		System.out.println("enetr array : ");
		int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();    
        }		
        bubblesort(arr,size);
        printarr(arr,size);
        
		
	}

}