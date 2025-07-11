package zoo.model.animal;

import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public abstract class Pachyderm extends Animal{
    private ConsoleUtil console = new ConsoleUtil();

    protected Enclosure location;

    public Pachyderm (boolean healthy, String name, Enclosure location) {
        super(healthy, name);
        this.location = location;
    }

    public void roam() {
        console.println(this.name + " roams");
    }
}
