package zoo.model.animal;

import zoo.model.building.enclosure.BirdEnclosure;
import zoo.model.building.enclosure.Enclosure;

import java.time.LocalDateTime;

public class AnimalAdmitted {
    private final Animal animal;
    private final LocalDateTime dateTimeAdmitted;
    private boolean isHealed;
    private LocalDateTime dateTimeHealed;

    public AnimalAdmitted(Animal animal, LocalDateTime dateTimeAdmitted) {
        this.animal = animal;
        this.dateTimeAdmitted = dateTimeAdmitted;
        isHealed = false;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDateTime getDateAdmitted() {
        return dateTimeAdmitted;
    }

    public LocalDateTime getDateTimeHealed() {
        return dateTimeHealed;
    }

    public void healAnimal(){
        isHealed = true;
        dateTimeHealed = java.time.LocalDateTime.now();
    }

    public boolean checkIfHealed(){
        return isHealed;
    }
}
