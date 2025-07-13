package zoo.model.animal;

import zoo.model.building.Building;
import zoo.utils.ConsoleUtil;

public abstract class Animal {

    private ConsoleUtil console = new ConsoleUtil();

    protected boolean healthy;
    protected String name;

    public Animal(){};
    public Animal (boolean healthy, String name){
        this.healthy = healthy;
        this.name = name;
    }

    public void eat() {
        console.println(name + " eats.");
    }

    public void sleep() {
        console.println(name + " sleeps.");
    }

    public void exercise() {console.println(name + "exercises");}

    public abstract void makeSound();

    public abstract void roam();

    public String getName(){ return name; }

    public boolean checkIfHealthy(){
        return healthy;
    }

    public void setHealthy (boolean healthy){
        this.healthy = healthy;
    }

    public abstract void goToLocation(Building building);
    public abstract Building getLocation();
}
