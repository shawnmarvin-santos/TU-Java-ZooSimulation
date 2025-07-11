package zoo.model.people;

import zoo.model.building.Building;

public class Vendor extends People{
    public Vendor(String name, Building location) {
        this.name = name;
        this.location = location;
    }
}
