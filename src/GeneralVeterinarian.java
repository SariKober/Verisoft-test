public class GeneralVeterinarian implements Veterinarian {
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General examination of " + pet.getName() + " the " + pet.getSpecies();
    }
}
