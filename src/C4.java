class Animal{
    void makesound(){
        System.out.println("Animal makes sound.");
    }
}
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Dog makes sound: Woof,Woof!!!");
    }
}
class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Cat makes sound: Meow,Meow!!!");
    }
}
public class C4 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal dog=new Dog();
        Cat cat=new Cat();


        animal.makesound();
        dog.makesound();
        cat.makesound();
    }
}
