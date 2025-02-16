import java.util.Scanner;
import java.util.function.Predicate;

public class B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Please enter a integer");
            int a=sc.nextInt();
            if(a==-1) break;
            Predicate<Integer> iseven=num->num%2==0;
            System.out.println(a+" is even: "+iseven.test(a));
        }
    }
}
