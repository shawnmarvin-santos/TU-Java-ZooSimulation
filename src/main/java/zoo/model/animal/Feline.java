package zoo.model.animal;

import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public abstract class Feline extends Animal{
    private ConsoleUtil console = new ConsoleUtil();

    protected Enclosure location;

    public void roam() {
        console.println(this.name + " roams");
    }
}
