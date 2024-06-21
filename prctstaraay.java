import java.util.Scanner;
public class prctstaraay {
    public static void main(String[] args) {
//      float []marks={10.0f,20.5f,30.5f,40.2f,50.5f};
//      float sum=0;
//      for(float element:marks){
//          sum= sum+element;
//      }
//        System.out.println(sum);

        //prct 2;
//        float [] marks={45.5f,49.f,45.5f,77.5f};
//        float num=45.5f;
//        boolean isInArray=false;
//        for (float element:marks){
//            if(num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("the value is present in the array");
//        }
        //prct 3 ;
//        float [] marks={10,20,30,40,50,};
//        float sum=0;
//        for(float element:marks){
//            sum=sum + element;
//        }
//        System.out.println("the averge value is :"+sum/marks.length);
 //  prct 3;
       //doo matrix ko add krge to dono ki size same honi chaiyhea
       /* int [][]math1={{1,2,3},
                {4,5,6}};
        int[][] math2={{2, 4,6},
                     {4,6,8}};
        int[][]result={{0,0,0},
                        {0,0,0}};
        for(int i=0;i<math1.length;i++){//row number of times
            for(int j=0;j<math1[i].length;j++){//column number of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=math1[i][j]+math2[i][j];
            }
        }
        //printing element
        for(int i=0;i<math1.length;i++){//row number of times
            for(int j=0;j<math1[i].length;j++){//column number of times
                System.out.format(result[i][j]+" ");
                result[i][j]=math1[i][j]+math2[i][j];
            }
            System.out.println("");//print new line
            */
        //prct 5;
//        int []arr={1,2,3,4,5,6};
//        int l =arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//    //swap a[i] and a[l-1-i]
//            temp = arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for(int element:arr){
//            System.out.println(element+" ");
//        }
//prct 6
      /*  int []arr={1,21,455,5,34,67};
        int max=0;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is : "+max);

       */
        //prct 8
        boolean isSorted = true;
        int [] arr={1,2,5,34};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the element is not sorted");
        }
    }

}
