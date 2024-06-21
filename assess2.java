class nokia{
    private int mic;
    private int cam;
    void setvalue(){
        mic=2;
        cam=40;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);

    }

}

class assess2{
    public static void main(String []args){
        nokia n1=new nokia();
        n1.display();
        n1.setvalue();
        n1.display();
       
    }
    
}
