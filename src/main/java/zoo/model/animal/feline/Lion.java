package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Lion extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Lion(){super();}

    public Lion(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public Lion(String s) {
    }

    public  void makeSound() {
        console.println(this.name + "purrs");
    }
}