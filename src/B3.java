public class B3 {
    public static int factorial(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("factorial of 5 is "+factorial(3));
    }
}
