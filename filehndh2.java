import java.io.*;
 class filehndh2 
{
    public static void main(String[] args) throws IOException{

  File b1=new File("a2.tex");
  b1.createNewFile();
    String s1="cording seekho";
    FileOutputStream f1=new FileOutputStream("a2.txt");
    char c1[]=s1.toCharArray();//converting array string to char array
    for(int i=0;i<c1.length;i++){
      f1.write(c1[i]);
    }
    f1.close();
}
}