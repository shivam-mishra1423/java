import javax.swing.*;
import java.awt.event.*;//used becuse used actionlisener
class LoginS extends JFrame{
    JLabel l1,l2,l3,l4;//object bahar bana diyea ta ki koi v access kr sakea
    JTextField t1,t2;
    JButton b1,b2;

    LoginS(String s1){//constructor of above LoginS
super(s1);
    }
    // LoginS(){

    //}

void Setcomponent(){
l1=new JLabel("Welcome to cording Seekho Institue");
l2=new JLabel("USERNAME");
l3=new JLabel("PASSWORD");
l4 =new JLabel();
t1=new JTextField();
t2 =new JTextField();
b1=new JButton("login");
b2=new JButton("clear");
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
l1.setBounds(100,50,300,30);
l2.setBounds(100,200,100,30);
l3.setBounds(100,350,100,30);
l4.setBounds(100,550,100,30);
t1.setBounds(350,200,100,30);
t2.setBounds(350,350,100,30);
b1.setBounds(200,450,300,30);
b2.setBounds(400,450,300,30);

b1.addActionListener(new j());
    
};

public class loginscreen3 {
    public static void main(String[] args){
        LoginS s1=new LoginS("Welcome To graphics cording");
        s1.setVisible(true);
        s1.setSize(700,700);
        s1.Setcomponent();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        class j implements ActionListener{
            public void actionPerformed(ActionEvent e1){
                String s1=t1.getText();
                String s2=t2.getText();
                if(s1.equals("cording") && s2.equals("seekho")){
                    l4.setText("login successfully");
                }
        
                else{
                    l4.setText("login unsuccessfully");
                }
            }
        }

    }
}