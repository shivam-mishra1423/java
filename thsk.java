class Example{
   private int x; int y;
   void f1(int x, int y){
    this.x=x;
    this.y=y;
   }
   void display(){
    System.out.println(x);
    System.out.println(y); 
   }
    };
public class thsk{
    public static void main(String[] args) {
        Example e1=new Example();
        e1.f1(10,11);
        e1.display();
    }
}
