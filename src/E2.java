public class E2 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            arr[4]=50;
        }catch (Exception e){
            System.out.println("Exception Handling: "+e);
        }finally {
            System.out.println("Finally Block always excutes");
        }
    }
}
