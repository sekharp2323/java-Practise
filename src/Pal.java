public class Pal {
    public static boolean ispalindrome(String str){
        str=str.toLowerCase();
        int left=0,right=str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome("Manam"));
    }
}
