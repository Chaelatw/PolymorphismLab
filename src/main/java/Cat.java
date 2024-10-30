public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void Speak() {
        System.out.println("Meow");;
    }
}
