package zoo.model.animal.feline;

import zoo.model.animal.Feline;
import zoo.utils.ConsoleUtil;

public class Cheetah extends Feline {
    private ConsoleUtil console = new ConsoleUtil();

    public  void makeSound() {
        console.println(this.name + "purrs");
    }
}