import java.util.Arrays;
import java.util.Scanner;

public class C7 {
    static void reverseArray(int[] arr, int left, int right) {
        if(left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    reverseArray(arr,0,arr.length-1);
    System.out.println("Reversed Array is: "+ Arrays.toString(arr));
    }
}
