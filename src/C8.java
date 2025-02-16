public class C8 {
    public static void main(String[] args) {
        int[] arr={10,20,5,19,14,70,30};
        int max=arr[0],min=arr[0];

        for(int num:arr) if (num>max) max=num;
        for (int num:arr) if(num<min) min=num;
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
