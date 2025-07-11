package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.Enclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.utils.ConsoleUtil;

public class Tiger extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Tiger(){super();}

    public Tiger(String name) {
        this.name = name;
        this.healthy = true;
        this.location = new FelineEnclosure();
    }

    public  void makeSound() {
        console.println(this.name + " the " + this.getClass().getCanonicalName() + " snarls");
    }
}