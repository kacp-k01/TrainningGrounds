package Annotations;

@VeryImportant
public class Cat {
    @ImportantString
    String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow");
    }

    public void munch() {
        System.out.println("Munch");
    }
}
