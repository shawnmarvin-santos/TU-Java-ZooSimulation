package zoo.model.animal;

import zoo.model.building.Building;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public abstract class Bird extends Animal{
    private ConsoleUtil console = new ConsoleUtil();

    protected Building location;

    public Bird() {}

    public void roam() {
        console.println(this.name + " roams");
    }

    @Override
    public Building getLocation() {
        return location;
    }

    @Override
    public void goToLocation(Building destination){
        location = destination;
    }
}
