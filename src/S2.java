public class S2 {
    public static int[] findSecondLargest(int[] args){
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        for(int num: args){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!= largest){
                secondLargest=num;
            }
        }
        return new int[]{largest,secondLargest};
    }
    public static void main(String[] args) {
        int[] arr={29,99,30,20,70,80,61,71,85,35,98,1,100,150,999};
        int[] result=findSecondLargest(arr);
        System.out.println("Largest: "+result[0]);
        System.out.println("Second: "+result[1]);
    }
}
