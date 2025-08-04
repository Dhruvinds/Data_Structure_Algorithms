// Interface

interface Animal {

    void bark();

    default void sleep() {
        System.out.println("Sleeping!!!!!!!");
    }
}

interface Cat {

    void ownerName();
}
// We can use multiple interface but not base class!!!

class Dog implements Animal, Cat {

    public void ownerName() {
        System.out.println("DS!!!!!");
    }

    public void bark() {
        System.out.println("Bark!!!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping!!!!");
    }
}

public class Interface {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.ownerName();
    }
}
