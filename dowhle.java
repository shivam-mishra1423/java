import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class dowhle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while(a<=5);
    }
}
