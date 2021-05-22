package animal;

public class Dog extends Animal{
    public Dog (int age, String name) {
        super(age, name);
        System.out.println("A dog has been born.");
    }

    public void bark () {
        System.out.println(this.name + " barks!");
    }

    public void run() {
        System.out.println("A dog is running");
    }
}
