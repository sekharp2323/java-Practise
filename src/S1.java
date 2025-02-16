import java.util.Scanner;

public class S1 {
    public static String stringreverser(String s) {
        if(s.length()==1) return s;
        else
            return s.charAt(s.length()-1)+stringreverser(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a word");
        String a=sc.nextLine();
        String reversed=stringreverser(a);
        System.out.println(reversed);
    }
}
