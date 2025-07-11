package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Tiger extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Tiger(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public  void makeSound() {
        console.println(this.name + "purrs");
    }
}