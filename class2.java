class a{
    static void out1(){
        System.out.println("outside class1");
    }
}
class class2{
    public static void main(){
        System.out.println("inside class");
        a.out1();
    }
}