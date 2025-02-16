abstract class Shape{
    abstract void draw();
    void displayInfo(){
        System.out.println("his is absarct shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing triangle");
    }
}
public class C2 {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        Shape triangle=new Triangle();
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
