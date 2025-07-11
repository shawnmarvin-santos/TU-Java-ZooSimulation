package zoo.model.animal.pachyderm;

import zoo.model.animal.Pachyderm;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.utils.ConsoleUtil;

public class Rhino extends Pachyderm {
    private ConsoleUtil console = new ConsoleUtil();

    public Rhino(){super();}

    public Rhino(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new PachydermEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + " the " + this.getClass().getSimpleName() + " bellows");
    }
}