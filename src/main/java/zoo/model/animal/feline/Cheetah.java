package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.model.building.enclosure.Enclosure;
import zoo.utils.ConsoleUtil;

public class Cheetah extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public Cheetah(){super();}

    public Cheetah(boolean healthy, String name, Enclosure location){
        super(healthy, name, location);
    }

    public Cheetah(String s) {
    }

    public  void makeSound() {
        console.println(this.name + "purrs");
    }
}