public class Search2 {
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
        int[] arr={3, 6, 18, 22, 26, 27, 34, 39, 39, 43, 56, 62, 63, 76, 77, 85, 93, 97, 99, 99};
        int target=93;
        int index=binarySearch(arr,target);
        System.out.println(target+" found at index: "+index);
    }
}
