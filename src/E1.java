public class E1 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());
            int num=Integer.parseInt("XYZ");
        }catch (NullPointerException | NumberFormatException e){
            System.out.println("Caught Exception: "+e.getMessage());

        }
    }
}
