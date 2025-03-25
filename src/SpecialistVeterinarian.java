public class SpecialistVeterinarian extends GeneralVeterinarian{
    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist examination of " + pet.getName() + " the " + pet.getSpecies() + " by " + specialty;
    }
}
