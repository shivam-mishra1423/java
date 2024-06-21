

class process1 extends Thread{
    public void run(){
        int i;
        for( i=1;i<=5;i++){
            System.out.println("process 1: "+i);
        }
    }
}
class process2 extends Thread{
   public  void run(){
        int i=0;
        for(i=1;i<5;i++){
            System.out.println("process 2 :"+i);
        }
    }
}
public class mlttrdsyn{
    public static void main(String[]args){
        process1 p1= new process1();
        process2 p2= new process2();
        p1.start();
        p2.start();
    }
    
}
