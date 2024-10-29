import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner pets = new Scanner(System.in);
//        System.out.println("How many pets do you have?");
//
//        String numPets = pets.nextLine();
//        System.out.println("What are each of their names");
//
//        String petName = pets.nextLine();
//
//        System.out.println("What kind of pet are each of them?");
//
//
//        String petType = pets.nextLine();
//
//        if (petType == "dog"){
//            Dog dog = new Dog(petName, "bark");
//            dog.Speak();
//        }  else if(petType == "cat") {
//            Cat cat = new Cat(petName,"meow");
//            cat.Speak();
//        }

        List<Pet> listOfPets = new ArrayList<>();

        listOfPets.add( new Dog("Dave","Bark"));
        listOfPets.add(new Cat("Steve","Meow"));
        PetsComparator petComparator = new PetsComparator();
        Collections.sort(listOfPets, petComparator);

        for (Pet p: listOfPets){
            System.out.println(p);
        }



//        System.out.println("You have " + numPets + " "+ "pets");
//        System.out.println("Their names are" + " " + petName);
//        System.out.println(petName + " are these kind of pets: " + petType);



    }
}
