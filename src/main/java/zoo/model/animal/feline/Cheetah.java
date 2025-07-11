package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.BirdEnclosure;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.utils.ConsoleUtil;

public class Cheetah extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Cheetah(){super();}

    public Cheetah(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public Cheetah(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new FelineEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + " the " + this.getClass().getSimpleName() + " purrs");
    }
}