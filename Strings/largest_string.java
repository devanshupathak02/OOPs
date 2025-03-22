public class largest_string{
    public static void main(String args[]){
        String fruits[]={"papaya","mango","banana","apple"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];

            }
        }
        System.out.print(largest);
    }
}