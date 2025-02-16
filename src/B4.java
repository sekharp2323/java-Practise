import java.util.Scanner;

public class B4 {
    static String stringReverser(String str){
        if(str.length()<=1) return str;
        else return str.charAt(str.length()-1)+stringReverser(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sc.nextLine();
        System.out.println(stringReverser(str));
    }
}
