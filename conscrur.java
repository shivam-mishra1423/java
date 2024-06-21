class Demo{
    int x,y;
Demo(){
System.out.println("constructor call");
}
}
public class conscrur {
    public static void main(String[] args) {
        Demo d1= new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        }
    
}
