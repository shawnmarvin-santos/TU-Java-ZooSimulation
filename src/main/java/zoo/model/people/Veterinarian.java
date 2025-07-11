package zoo.model.people;

import zoo.model.building.Hospital;

public class Veterinarian extends People{
    public Veterinarian(String name) {
        this.name = name;
        this.location = new Hospital();
    }
}
