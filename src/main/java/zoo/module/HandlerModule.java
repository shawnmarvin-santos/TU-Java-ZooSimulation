package zoo.module;

import zoo.model.animal.Animal;
import zoo.model.building.Hospital;
import zoo.model.people.Handler;
import zoo.repository.AnimalRepository;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

import java.util.List;

public class HandlerModule {
    private final Handler handler;

    public HandlerModule(Handler handler) {
        this.handler = handler;
    }

    public void start() {
        ConsoleUtil.printf(MessageConstants.HANDLER_MODULE_BANNER, handler.getName());

        while (true) {
            ConsoleUtil.println(MessageConstants.ANIMAL_DUTY_MESSAGE);

            List<Animal> assignedAnimals = AnimalRepository.getInstance().getAssignedAnimals(handler);


            for (int i = 0; i < assignedAnimals.size(); i++){
                System.out.println((i+1) + ". " + assignedAnimals.get(i).getName());
            }

            int choice = InputValidationUtil.promptForOption(
                    MessageConstants.ENTER_ANIMAL_PROMPT,
                    0,
                    assignedAnimals.size());
            if(choice == 0){
                return;
            } else {
                interactWithAnimal(assignedAnimals.get(choice - 1));
            }
        }
    }

    private void interactWithAnimal(Animal animal) {
        ConsoleUtil.printf(MessageConstants.ANIMAL_ACTION_BANNER, animal.getName());
        int actionChoice = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 3);

        switch (actionChoice) {
            case 1:
                handler.feed(animal);
                animal.eat();
                break;
            case 2:
                animal.exercise();
                break;
            case 3:
                animal.goToLocation(new Hospital());
                animal.setHealthy(false);
                AnimalRepository.getInstance().admitAnimalToHospital(animal);
                break;
        }
    }
}
