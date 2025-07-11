package zoo.model.people;

import zoo.model.animal.Animal;
import zoo.model.building.Building;
import zoo.utils.ConsoleUtil;

public class Handler extends People{
    public Handler(String name, Building location) {
        this.name = name;
        this.location = location;
    }

    public void feed(Animal animal){
        ConsoleUtil.println("Handler " + name + " feeds " + animal.getName());
        animal.eat();
    }

    public String getName(){
        return name;
    }

    public Building getLocation(){
        return location;
    }
}
