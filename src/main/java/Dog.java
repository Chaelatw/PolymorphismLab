public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void Speak() {
        System.out.println("Bark");;
    }
}
