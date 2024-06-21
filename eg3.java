class out{
    int x;//instance(object) member variable
    int y;//instance(object) member variable
void fun1(){
        System.out.println("fun1");
    }
void fun2()//instance(object) member function 
{
    System.out.println("fun2");
}
}
class Eg3{
public static void main(String[] arg){
out m1=new out();//new object m1 created
out m2=new out();//new object m2 created
m1 .x=(5);
System.out.println(m1.x);
System.out.println(m1.y);
m2.x=(21);
System.out.println(m2.x);
}
}
