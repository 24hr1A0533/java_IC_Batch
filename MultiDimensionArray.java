public class MultiDimensionArray
{
public static void main(String[]a){
    int [][] arr={{1,2,3,4},{1,2,3,4,},{1,2,3,4}};
    for (int i=0;i<3;i++){
        for (int j=0;j<4;j++){
            System.out.print(arr[i][j] +"  ");
        }
        System.out.println();
    }
    int [][] arr1=new int[4][4];
    for (int i=0;i<4;i++) {
        for (int j = 0; j < 4; j++) {
        arr1[i][j] = (int)(Math.random()*100);
        }
    }
    for (int i=0;i<3;i++){
        for (int j=0;j<4;j++){
            System.out.print(arr1[i][j] +"  ");
        }
        System.out.println();
    }
    System.out.println( );
 for (int[] n:arr1) {
     for (int m : n) {
         System.out.print(m+"   ");
     }
     System.out.println();
 }
 int[]arr2={1,2,3,4,5,6};
 for (int k:arr2){
     if(k==2) System.out.println("hello");
     else System.out.println(" bye ");
 }
}
}
