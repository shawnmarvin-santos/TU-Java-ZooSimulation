package zoo.module;

import zoo.model.animal.Animal;
import zoo.model.people.Handler;
import zoo.repository.AnimalRepository;

import java.util.List;

public class HandlerModule {
    private Handler handler;
    private List<Animal> assignedAnimals;

    public HandlerModule(Handler handler) {
        this.handler = handler;
        start();
    }

    public void start() {
        System.out.println("\nWelcome, Handler " + handler.getName() + "!");

        while (true) {
            System.out.println("\n--- Animal Duty Menu ---");
            System.out.println("Animals assigned to you:");

            assignedAnimals = AnimalRepository.getInstance().getAssignedAnimals(handler);

            for (int i = 1; i <= assignedAnimals.size(); i++){
                System.out.println(i + ". " + assignedAnimals.get(i).getName());
            }
            System.out.print("Choose animal number to interact with (0 to exit): ");
//
//            if (animalChoice == 0) {
//                System.out.println("Finished duties for the day.");
//                break;
//            }
//
//            if (animalChoice < 1 || animalChoice > assignedAnimals.size()) {
//                System.out.println("Invalid choice. Please try again.");
//                continue;
//            }
//
//            Animal selectedAnimal = assignedAnimals.get(animalChoice - 1);
//            interactWithAnimal(selectedAnimal);
        }
    }

//    private void interactWithAnimal(Animal animal) {
//        System.out.println("\nChoose action:");
//        System.out.println("1. Feed " + animal.getName());
//        System.out.println("2. Exercise " + animal.getName());
//        System.out.println("3. Examine " + animal.getName() + " to Vet");
//        System.out.print("Choose an option: ");
//
//        int actionChoice = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        switch (actionChoice) {
//            case 1:
//                animal.feed();
//                break;
//            case 2:
//                animal.exercise();
//                break;
//            case 3:
//                sendToHospital(animal);
//                break;
//            default:
//                System.out.println("Invalid option.");
//        }
//    }
//
//    private void sendToHospital(Animal animal) {
//        System.out.println("\nSending to Hospital...");
//        Hospital.getInstance().admitAnimal(animal);
//        System.out.println(animal.getName() + " admitted at " + java.time.LocalDateTime.now());
//    }
//
//    private List<Animal> initializeAssignedAnimals(String handlerName) {
//        // Simplified for demo - in real app, this would come from a database
//        List<Animal> animals = new ArrayList<>();
//
//        if (handlerName.equalsIgnoreCase("Claire")) {
//            animals.add(new zoo.animals.Feline("Mufasa"));
//            animals.add(new zoo.animals.Feline("Simba"));
//        } else if (handlerName.equalsIgnoreCase("Robert")) {
//            animals.add(new zoo.animals.Pachyderm("Dumbo"));
//        } else if (handlerName.equalsIgnoreCase("Jack")) {
//            animals.add(new zoo.animals.Bird("Hedwig"));
//        }
//
//        return animals;
//    }
}
