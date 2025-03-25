public class SpecialistVeterinarian implements Veterinarian{
    private String name;
    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist examination of " + pet.getName() + " the " + pet.getSpecies() + " by " + specialty;
    }
}
