package zoo.model.animal.bird;

import zoo.model.animal.Bird;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Parrot extends Bird {
    private ConsoleUtil console = new ConsoleUtil();

    public Parrot(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public  void makeSound() {
        console.println(this.name + "chirps");
    }
}