package zoo.model.animal;

import zoo.model.building.Building;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public abstract class Feline extends Animal{
    private ConsoleUtil console = new ConsoleUtil();

    protected Building location;

    public Feline(){}

    public Feline (boolean healthy, String name, Enclosure location) {
        super(healthy, name);
        this.location = location;
    }

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
