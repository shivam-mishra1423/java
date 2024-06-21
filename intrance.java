class Nokia1{
    int x,y;
    void f1(){
System.out.println("parent function 1 executed");
    }
    void f2(){
System.out.println("parent function 2 executed");
    }
}
class Nokia2 extends Nokia1{
int z;
void f3(){
    System.out.println("chils function 1 executed :");
}
}
public class intrance {
    public static void main(String[] args) {
    Nokia2 n2=new Nokia2();
    n2.f3();
    n2.f1();
    n2.f2();
    }
}
