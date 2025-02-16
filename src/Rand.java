import java.util.Arrays;
import java.util.Random;

public class Rand {
    static int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers=new int[20];
        Random rand=new Random();
        for(int i=0;i<numbers.length;i++) {
            numbers[i]=rand.nextInt(0,101);
        }
        System.out.println("Generated Random number: "+ Arrays.toString(numbers));
        /*for(int num:numbers) {
            System.out.println(num+ " ");
        }*/
        int n=numbers.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is "+Arrays.toString(numbers));

        int target=91;
        int index=binarySearch(numbers,target);
        System.out.println(target+" found at index: "+index);
    }
}
