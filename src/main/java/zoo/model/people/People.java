package zoo.model.people;

import zoo.model.building.Building;

public abstract class People {
    protected String name;
    protected Building location;

    public void goTo(Building newLocation){
        this.location = newLocation;
    };
}
