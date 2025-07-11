package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.utils.ConsoleUtil;

public class Lion extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Lion(){super();}

    public Lion(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new FelineEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + "purrs");
    }
}