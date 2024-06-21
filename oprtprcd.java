public class oprtprcd {
    public static void main(String[] args) {
        //precedence & Associactivity
        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and / . they are them evaluated on the basic of left to right associactivute
        =30-34/2
        =30-17
        =13
         */
        int b=60/5-34*2;
        /*
        =12-34*2
        12-68
        =-56
         */
        System.out.println(a);
        System.out.println(b);
    }
}
