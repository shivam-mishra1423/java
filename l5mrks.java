import java.util.Scanner;
public class l5mrks {
    public static void main(String[] args) {
        System.out.println("Enter marks form the student : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Subject Marks : ");
        float a=sc.nextFloat();
        System.out.println("Enter Chemistry Subject Marks : ");
        float b=sc.nextFloat();
        System.out.println("Enter Maths Subject Marks : ");
        float c=sc.nextFloat();
        System.out.println("Enter English Subject Marks : ");
        float d=sc.nextFloat();
        System.out.println("Enter Hindi Subject Marks : ");
        float e=sc.nextFloat();
        /* Calculate total, average and percentage */
        float total = a + b + c + d + e;
        float average = (total / 5);
        float percentage = (total / 500) * 100;

        /* Print all results */
        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);

    }
}
