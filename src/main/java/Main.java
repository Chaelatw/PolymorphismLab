import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        int petCount = scanner.nextInt();
        scanner.nextLine();

        List<Pet> pets = new ArrayList<>();

        for (int x = 0; x < petCount; x++) {
            System.out.print("Enter pet type: ");
            String type = scanner.nextLine();
            System.out.print("Enter pet name: ");
            String name = scanner.nextLine();

//
//        listOfPets.add( new Dog("Dave"));
//        listOfPets.add(new Cat("Steve"));
//        PetsComparator petComparator = new PetsComparator();
//        Collections.sort(listOfPets, petComparator);
//
//        for (Pet p: listOfPets){
//            System.out.println(p);
//        }


//        System.out.println("You have " + numPets + " "+ "pets");
//        System.out.println("Their names are" + " " + petName);
//        System.out.println(petName + " are these kind of pets: " + petType);


        }
    }
}
