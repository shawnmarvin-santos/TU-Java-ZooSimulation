package zoo.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import zoo.model.animal.Animal;
import zoo.model.animal.AnimalAdmitted;
import zoo.model.building.Building;
import zoo.model.building.Hospital;
import zoo.model.building.enclosure.BirdEnclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.model.people.Handler;
import zoo.utils.AnimalFactoryUtil;
import zoo.utils.ConsoleUtil;
import zoo.utils.MessageConstants;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnimalRepository {
    private static AnimalRepository instance;
    private AnimalRepository(){}

    private ArrayList<Animal> animals;
    private ArrayList<AnimalAdmitted> hospitalAdmissionLogs;

    public static AnimalRepository getInstance(){
        if(instance == null){
            instance = new AnimalRepository();
        }
        return instance;
    }

    public void instantiateAnimals() {
        ObjectMapper mapper = new ObjectMapper();
        animals = new ArrayList<>();
        hospitalAdmissionLogs = new ArrayList<>();
        try{
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Animals.json");
            List<Map<String, String>> animalJsonList = mapper.readValue(
                    inputStream,
                    new TypeReference<List<Map<String, String>>>() {}
            );
            for (Map<String, String> animal: animalJsonList){
                String name = animal.get("Name");
                String type = animal.get("Type");
                animals.add(AnimalFactoryUtil.create(type,name));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(MessageConstants.FILE_NOT_FOUND);
        }
    }

    public List<Animal> getAssignedAnimals(Handler handler){
        if(handler.getLocation() instanceof BirdEnclosure){
            return filterByLocation("Bird-Enclosure");
        }
        if(handler.getLocation() instanceof FelineEnclosure){
            return filterByLocation("Feline-Enclosure");
        }
        if(handler.getLocation() instanceof PachydermEnclosure){
            return filterByLocation("Pachyderm-Enclosure");
        }

        throw new IllegalArgumentException(MessageConstants.INVALID_HANDLER_NAME_ERROR);
    }

    private List<Animal> filterByLocation(String type){
        return animals.stream().filter(animal -> switch (type.toLowerCase()) {
            case "bird-enclosure" -> animal.getLocation() instanceof BirdEnclosure;
            case "feline-enclosure" -> animal.getLocation() instanceof FelineEnclosure;
            case "pachyderm-enclosure" -> animal.getLocation() instanceof PachydermEnclosure;
            case "hospital" -> animal.getLocation() instanceof Hospital;
            default -> false;
        }).toList();
    }

    public void admitAnimalToHospital(Animal animalToBeUpdated){
        ConsoleUtil.println(MessageConstants.SENDING_TO_HOSPITAL_MESSAGE);
        saveAnimalLocation(animalToBeUpdated, new Hospital());
        AnimalAdmitted animalAdmitted = new AnimalAdmitted(animalToBeUpdated, java.time.LocalDateTime.now());
        hospitalAdmissionLogs.add(animalAdmitted);
        ConsoleUtil.printf(MessageConstants.ANIMAL_ADMITTED_SUCCESSFUL_MESSAGE,
                animalAdmitted.getAnimal().getName(),
                animalAdmitted.getDateAdmitted());
    }

    public void saveAnimalLocation(Animal animalToBeUpdated, Building newLocation){
        for (Animal animal: animals){
            if(animal.equals(animalToBeUpdated)){
                animal.goToLocation(newLocation);
            }

            break;
        }
    }

}
