// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Composer subclass of Musician class

import java.util.ArrayList;
public class Composer extends Musician {
    private boolean isLockedInHouse;
    private String bestComposition;

    public Composer(String name, boolean isLockedInHouse, String bestComposition) {
        super(name);
        this.isLockedInHouse = isLockedInHouse;
        this.bestComposition = bestComposition;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and my most popular composition is " + this.bestComposition + ".";
    }

    @Override
    public void chooseNeighbourhoodCompetitor() {
        System.out.println(this);
        if (this.isLockedInHouse) {
            if (getName().equals("Mozart")) {
                System.out.println("I have helped lock the other contestants in the house with Beethoven!");
            } else {
                System.out.println("I have helped lock the other contestants in the house with Mozart!");
            }
        } else {
            System.out.println("Somebody help me! I have been locked in my house and I cannot reach the bus, what should I do?");
        }
    }



    public boolean getLockedStatus() {
        return this.isLockedInHouse;
    }
    @Override
    public void reactToEmergency() {
        if (isLockedInHouse) {
            System.out.println(getName() + " is locked in and cannot react to the emergency.");
        } else {
            System.out.println("As " + getName() + ", I myself believe this inexplicable occurrance the opportune moment to compose a dramatic symphony.");
        }
    }

    @Override
    public void compete() {
        if (!isLockedInHouse) {
            System.out.println(getName() + " competes with a newly composed piece.");
        } else {
            System.out.println(getName() + " cannot compete because they are locked in.");
        }
    }

    @Override
    public void vote(ArrayList<Musician> musicians) {
        // Implementation of vote method for Composer
    }

    @Override

    public void exitBus() {
        super.exitBus();
//        Require implementation of specific exitBus() Methods
    }
}