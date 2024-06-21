class A{
    static void outcls(){
       System.out.println("outside the class");
    }
}

class eg2 {
    public static void main(String[] arg){
        System.out.println("inside thie class");
        A.outcls();
    }
    
}
