package zoo.model.people;

import zoo.model.building.Hospital;
import zoo.utils.ConsoleUtil;

public class Veterinarian extends People{
    public Veterinarian(String name) {
        this.name = name;
        this.location = new Hospital();
    }

    public void Heal() {
        ConsoleUtil.println("Dr. " + name +" Begins healing sick animals...");
    }

    public void Lecture() {
        ConsoleUtil.println("Dr. " + name +" Begins lecture...");
    }
}
