interface i1{
void f1();//iss function ka koi body nhi hoga because ye interface k under h
    int x=6;
static void f2(){
    System.out.println(x);
}
}
interface i2 extends i1{
int y=9;
void f3();

}
class c1 implements  i2
{
public void f1(){

}
public void f2(){
    //yaha f2 ko overrider krkea used kr rehe h
}
public void f3(){

}
}
public class intrfec {
    public static void main(String[]args){
        c1 c=new c1();
        System.out.println(c1.x);
        System.out.println(c1.y);
//     i1.f2();
    }
}
