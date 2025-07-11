package zoo.model.animal.pachyderm;

import zoo.model.animal.Pachyderm;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.utils.ConsoleUtil;

public class Hippo extends Pachyderm {
    private ConsoleUtil console = new ConsoleUtil();

    public Hippo(){super();}

    public Hippo(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new PachydermEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + "growls");
    }
}