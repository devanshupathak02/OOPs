import java.util.*;
public class shortestpath{
    public static float path(String str){
        int x=0 ,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x=x+1;
            }
            else if(str.charAt(i)=='W'){
                x=x-1;
            }
            else if(str.charAt(i)=='N'){
                y=y+1;
            }
            else if(str.charAt(i)=='S'){
                y=y-1;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);

    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.print(path(str));
    }
}