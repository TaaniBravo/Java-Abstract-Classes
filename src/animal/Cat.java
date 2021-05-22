package animal;

public class Cat extends Animal {

    public Cat (int age, String name) {
        super(age, name);
        System.out.println("A cat has entered the room.");
    }

    public void meow() {
        System.out.println("Meow Meow");
    }

    public void claw() {
        System.out.println("Clawing up a storm.");
    }
}
