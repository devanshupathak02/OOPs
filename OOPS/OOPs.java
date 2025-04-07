public class OOPs{
    public static void main(String args[]){
        Pen p1=new Pen(); // created a pen object named "p1"
        p1.setcolor("blue");
        System.out.println(p1.color);//we can call the "method" as well as the "properties"
        p1.settip(5);
        System.out.print(p1.tip);
        BankAcct bk =new BankAcct();
        System.out.print(bk.username="devnashu");
        bk.setpss("fff");

    }
}
// below are the classes 
class BankAcct{
    public String username;
    private String pass;
    public void setpss(String npass){
         pass=npass;
    }

}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}