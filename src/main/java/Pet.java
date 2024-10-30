
public abstract class Pet implements Comparable<Pet> {
    private String name;


    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void Speak(){
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
