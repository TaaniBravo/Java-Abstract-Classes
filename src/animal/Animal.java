package animal;

public class Animal {
    public int age;
    public String name;

    public Animal (int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("An animal has been created.");
    }

    public void eat () {
        System.out.println("An animal is eating.");
    }

    public static void main(String[] args) {
        Animal a = new Animal(1, "Ted");
        Dog cruz = new Dog(3, "Cruz");
        Cat maow = new Cat(1, "Maow");
        cruz.bark();
        maow.meow();
        a.eat();
    }
}
