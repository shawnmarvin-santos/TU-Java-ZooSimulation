package zoo.model.animal.bird;

import zoo.model.animal.Bird;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Owl extends Bird {
    private ConsoleUtil console = new ConsoleUtil();

    public Owl(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public Owl(String s) {
    }

    public  void makeSound() {
        console.println(this.name + "chirps");
    }
}