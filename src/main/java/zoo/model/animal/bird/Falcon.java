package zoo.model.animal.bird;

import zoo.model.animal.Bird;
import zoo.model.building.enclosure.BirdEnclosure;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Falcon extends Bird {
    private ConsoleUtil console = new ConsoleUtil();

    public Falcon(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new BirdEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + "chirps");
    }
}