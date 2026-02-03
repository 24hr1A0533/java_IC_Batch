import java.util.Scanner;
public class Comparing_array {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the size of an 1st array");
        int size1 = data.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i <= size1 - 1; i++) {
            arr1[i] = data.nextInt();
        }
        System.out.println("enter the size of an 2nd array");
        int size2 = data.nextInt();
        int[] arr2 = new int[size2];
        for (int j = 0; j <= size2 - 1; j++) {
            arr2[j] = data.nextInt();
        }
        boolean found=false;
        System.out.println("matching elements");
        for(int k=0;k<=size1-1;k++){
            for(int l=0;l<=size2-1;l++){
                if(arr1[k]==arr2[l])
                    System.out.println(arr1[k]);
                found=true;
            }
        }
        if (found==true){
            System.out.println("cointain matching elements");
        }
        else {
            System.out.println("no matching elements");
        }
    }
}
