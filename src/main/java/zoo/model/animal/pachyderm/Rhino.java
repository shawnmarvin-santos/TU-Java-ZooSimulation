package zoo.model.animal.pachyderm;

import zoo.model.animal.Pachyderm;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Rhino extends Pachyderm {
    private ConsoleUtil console = new ConsoleUtil();

    public Rhino(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public  void makeSound() {
        console.println(this.name + "growls");
    }
}