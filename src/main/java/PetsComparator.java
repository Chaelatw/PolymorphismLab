import java.util.Comparator;

public class PetsComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet dog, Pet cat) {
        return dog.getName().compareTo(cat.getName());
    }
}
