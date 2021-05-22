package animal;

public abstract class Animal {
    public int age;
    public String name;

    public Animal (int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("An animal has been created.");
    }

    public abstract void eat ();

    public void sleep() {
        System.out.println("An animal is sleeping.");
    }

    public static void main(String[] args) {
        Dog cruz = new Dog(3, "Cruz");
        Cat maow = new Cat(1, "Maow");
        cruz.bark();
        cruz.eat();
        maow.meow();
        maow.sleep();
        cruz.sleep();
    }
}
