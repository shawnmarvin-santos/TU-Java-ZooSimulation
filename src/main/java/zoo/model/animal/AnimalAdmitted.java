package zoo.model.animal;

import java.time.LocalDateTime;
import java.util.Date;

public class AnimalAdmitted {
    private final Animal animal;
    private final LocalDateTime dateTimeAdmitted;

    public AnimalAdmitted(Animal animal, LocalDateTime dateTimeAdmitted) {
        this.animal = animal;
        this.dateTimeAdmitted = dateTimeAdmitted;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDateTime getDateAdmitted() {
        return dateTimeAdmitted;
    }
}
