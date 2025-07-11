package zoo.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import zoo.model.animal.Animal;
import zoo.utils.AnimalFactoryUtil;
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

    public static AnimalRepository getInstance(){
        if(instance == null){
            instance = new AnimalRepository();
        }
        return instance;
    }

    public void instantiateAnimals() {
        ObjectMapper mapper = new ObjectMapper();
        animals = new ArrayList<>();
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
}
