import java.util.Scanner;
public class
Array_Linear_Search {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=data.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<=size-1;i++)
        {
            arr[i]=data.nextInt();
        }
        System.out.println("enter a element to find its present in an array or not");
        int key =data.nextInt();
        boolean found=false;

        for(int arr1 : arr)
        {
            if(arr1 == key){
                found=true;
            }

        }
        if (found==true)
        {
            System.out.println("element is present");
        }
        else
        {
            System.out.println("element is not present");
        }


    }

}
