public class mhd {
    static  void change(int a){
        a=98;
    }
    static  void change2(int []arr){
        arr[0]=98;
    }



    public static void main(String[] args) {
  int []marks = {52,73,77,89,98,94};
          change2(marks);
  System.out.println("the value of x after changing :"+marks[0]);
    }
}
