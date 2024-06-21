import java.util.Scanner;

public class prctch3{
    public static void main(String[] args) {
        //Q1 chapter 3
//        String st ="shivam";
//        String lcase=st.toLowerCase();
//        System.out.println(lcase);
        //
        //Q2
//        String st ="     shivam";
//        System.out.println("before\n"+st);
//        String lcase=st.trim();
//        System.out.println(lcase);
       String lettter ="Dear <|name|>, Thanks a lot";
       String value=lettter.replace("<|name|>","shivam");
        System.out.println(value);
    }
}
