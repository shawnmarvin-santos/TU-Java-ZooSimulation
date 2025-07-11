package zoo.model.animal.bird;

import zoo.model.animal.Bird;
import zoo.utils.ConsoleUtil;

public class Parrot extends Bird {
    private ConsoleUtil console = new ConsoleUtil();

    public  void makeSound() {
        console.println(this.name + "chirps");
    }
}