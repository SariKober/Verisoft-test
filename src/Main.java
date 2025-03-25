import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // יצירת חיות מחמד
        Pet dog = new Dog("Rexi", 5, "Labrador");
        Pet cat = new Cat("Shmizi", 3, "White");

        // יצירת וטרינרים
        Veterinarian generalVet = new GeneralVeterinarian("Dr. Smith");
        Veterinarian specialistVet = new SpecialistVeterinarian("Dr. Johnson", "Dermatology");

        // יצירת רשימה של חיות מחמד
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        // הדגמת תהליך הבדיקה
        for (Pet pet : pets) {
            System.out.println("Examining " + pet.getName() + ":");
            System.out.println(generalVet.examinePet(pet));
            System.out.println(specialistVet.examinePet(pet));
            System.out.println();
        }
    }
}