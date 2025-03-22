public class stringbuilder{
    public static void main(String args[]){
        StringBuilder str=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            str.append(ch);//str is not a array using of .append is must
        }
        System.out.print(str);
    }
}