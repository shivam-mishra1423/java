class exphnd{
    public static void main(String[] args){
    String s1=null;
    try{
        System.out.println(s1.length());
    }
    catch(NullPointerException e1){
        System.out.println(e1.getMessage());
    }
    System.out.println("A");
         
    try{
        System.out.println(5/0);
    }
    catch(ArithmeticException n1){
        System.out.println("B");
    }
}
}