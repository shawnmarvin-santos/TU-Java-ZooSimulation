package zoo.utils;

import zoo.model.animal.Animal;
import zoo.model.animal.bird.*;
import zoo.model.animal.feline.*;
import zoo.model.animal.pachyderm.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class AnimalFactoryUtil {
    private static final Map<String, Function<String, Animal>> animalRegistry = new HashMap<>();

    static {
        animalRegistry.put("Falcon", Falcon::new);
        animalRegistry.put("Owl", Owl::new);
        animalRegistry.put("Parrot", Parrot::new);
        animalRegistry.put("Cheetah", Cheetah::new);
        animalRegistry.put("Lion", Lion::new);
        animalRegistry.put("Tiger", Tiger::new);
        animalRegistry.put("Elephant", Elephant::new);
        animalRegistry.put("Hippo", Hippo::new);
        animalRegistry.put("Rhino", Rhino::new);
    }

    public static Animal create(String type, String name){
        Function<String, Animal> animalConstructor = animalRegistry.get(type);
        if(animalConstructor == null) {
            throw new IllegalArgumentException(MessageConstants.INVALID_ANIMAL_TYPE);
        }
        return animalConstructor.apply(name);
    }
}
