import java.util.Scanner;
public class Array_2Dimensional {
    public static void main (String[]args){
        Scanner data=new Scanner(System.in);
        int[][]arr=new int[3][2];
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                arr[i][j]=data.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
