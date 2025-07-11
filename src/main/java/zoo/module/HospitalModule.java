package zoo.module;

import zoo.model.animal.AnimalAdmitted;
import zoo.model.people.Veterinarian;
import zoo.repository.AdminRepository;
import zoo.repository.AnimalRepository;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

import java.util.List;

public class HospitalModule {
    private Veterinarian veterinarianOnDuty;

    public void start(){
        Veterinarian veterinarian = AdminRepository.getInstance().getZooStaff().getVeterinarianOnDuty();

        ConsoleUtil.println(MessageConstants.VISITOR_VISIT_HOSPITAL_BANNER);

        while (true) {
            int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 5);

            switch (option){
                case 1:
                    displaySickAnimals();
                    break;
                case 2:
                    displayHealedAnimals();
                    break;
                case 3:
                    veterinarian.Lecture();
                    break;
                case 4:
                    veterinarian.Heal();
                    AnimalRepository.getInstance().returnAnimals();
                    break;
                case 5:
                    ConsoleUtil.println(MessageConstants.THANK_YOU_FOR_VISITING_MESSAGE);
                    return;
            }
        }
    }

    private void displaySickAnimals() {
        List<AnimalAdmitted> admittedList = AnimalRepository.getInstance().getSickAnimals();

        ConsoleUtil.println(MessageConstants.SICK_ANIMALS_HEADER_MESSAGE);

        if(admittedList.isEmpty()){
            ConsoleUtil.println(MessageConstants.SICK_ANIMALS_LIST_EMPTY);
            return;
        }

        for(AnimalAdmitted animalAdmitted : admittedList){
            ConsoleUtil.printf(
                    MessageConstants.SICK_ANIMAL_LIST_FORMAT,
                    animalAdmitted.getAnimal().getName());
        }
    }

    private void displayHealedAnimals() {
        List<AnimalAdmitted> admittedList = AnimalRepository.getInstance().getHealedAnimals();

        ConsoleUtil.println(MessageConstants.HEALED_ANIMALS_HEADER_MESSAGE);

        if(admittedList.size()<=0){
            ConsoleUtil.println(MessageConstants.HEALED_ANIMAL_LIST_FORMAT);
            return;
        }

        for(AnimalAdmitted animalAdmitted : admittedList){
            ConsoleUtil.printf(
                    MessageConstants.HEALED_ANIMAL_LIST_FORMAT,
                    animalAdmitted.getAnimal().getName(), animalAdmitted.getDateTimeHealed());
        }
    }
}
