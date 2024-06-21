abstract class demo{
    int x=10,y;
}
class demo1 extends demo{

}
public class abstrct{
    public static void main(String[]args){
        demo1 d1=new demo1();
        d1.x=5;
        d1.y=10;
        System.out.println(d1.x);
        System.out.println(d1.y);

    }
}
