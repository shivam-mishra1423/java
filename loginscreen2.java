import javax.swing.*;
class LoginS extends JFrame{
    LoginS(String s1){//constructor of above LoginS
super(s1);
    }
    // LoginS(){

    // }

void Setcomponent(){
JLabel l1=new JLabel("WELCOME");
JTextField t1=new JTextField();
add(l1);
setLayout(null);
l1.setBounds(200,100,100,20);
add(t1);
t1.setBounds(200,200,100,30);
}
}
public class loginscreen2 {
    public static void main(String[] args){
        LoginS s1=new LoginS("Welcome To cording Seekho");
        s1.setVisible(true);
        s1.setSize(300,300);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.Setcomponent();
    }
}
