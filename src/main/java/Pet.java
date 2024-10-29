
public abstract class Pet implements Comparable<Pet> {
    private String name;
    private String speak;

    public Pet(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
    public void Speak(){
        System.out.println(name + " says " + speak);
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
