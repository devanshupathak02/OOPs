public class StaticKeyword{
    public static void main(String args[]){
        Student st=new Student();
        st.schoolname="abc";
        Student st1=new Student();
        System.out.print(st1.schoolname);
    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
    return this.name;
    }
}// if i am making a static keyword in a class and makes multiple object of the same class
//then the properties remains same in each object 
// as of here school name was set once thenn for each object it remained same.