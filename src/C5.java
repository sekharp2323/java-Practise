public class C5 {
int add(int a,int b){
    return a + b;
}
int add(int a,int b,int c){
    return a + b + c;
}
double add(double a,double b){
    return a+b;
}

    public static void main(String[] args) {
    C5 cl=new C5();
        System.out.println("Sum(int,int): "+cl.add(29,35));
        System.out.println("Sum(int,int,int): "+cl.add(19,15,23));
        System.out.println("Sum(double,double): "+cl.add(2.9,3.5));
    }
}
