package zoo.model.animal;

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
        console.println(name + "eats.");
    }

    public void sleep() {
        console.println(name + "sleeps.");
    }

    public abstract void makeSound();

    public abstract void roam();
}
