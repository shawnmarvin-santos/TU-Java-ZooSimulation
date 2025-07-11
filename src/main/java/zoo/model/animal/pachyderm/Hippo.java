package zoo.model.animal.pachyderm;

import zoo.model.animal.Pachyderm;
import zoo.utils.ConsoleUtil;

public class Hippo extends Pachyderm {
    private ConsoleUtil console = new ConsoleUtil();

    public  void makeSound() {
        console.println(this.name + "growls");
    }
}