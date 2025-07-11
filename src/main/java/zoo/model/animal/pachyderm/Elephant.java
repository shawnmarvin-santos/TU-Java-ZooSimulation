package zoo.model.animal.pachyderm;

import zoo.model.animal.Pachyderm;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.utils.ConsoleUtil;

public class Elephant extends Pachyderm {
    private ConsoleUtil console = new ConsoleUtil();

    public Elephant(){super();}

    public Elephant(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public Elephant(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new PachydermEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + " the " + this.getClass().getCanonicalName() + " snorts");
    }
}