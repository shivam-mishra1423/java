class Demo{
    int x,y;

Demo(){
  x=5;
  y=6;
}
void fun1(){
    x=10;
    y=11;
}
}
class cnst {
    public static void main(String[] args) {
        Demo d1=new Demo();
     
        System.out.println(d1.x);
        System.out.println(d1.y);
    }
    
}
