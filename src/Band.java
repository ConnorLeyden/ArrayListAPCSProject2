// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Band subclass of Musician class

import java.util.ArrayList;
public class Band extends Musician {
    private boolean isInAlliance;
    private String bestSong;

    public Band(String name, boolean isInAlliance, String bestSong) {
        super(name, "band");
        this.isInAlliance = isInAlliance;
        this.bestSong = bestSong;
    }

    @Override
    public void chooseNeighbourhoodCompetitor() {
        System.out.println(this);
        if (this.isInAlliance) {
            System.out.println("I have entered into an alliance to crush the Rolling Stones for good!");
        } else {
            System.out.println("This is an outrage! I am being teamed up on and blocked from getting on the bus!");
        }
    }

    public boolean isEligibleForBus() {
        return this.isInAlliance;
    }
    @Override
    public void reactToEmergency() {
        if (isInAlliance) {
            System.out.println(getName() + ": I need to make sure all my fellow band members are alright.");
        } else {
            System.out.println(getName() + " is on their own, trying to figure out a solo act.");
        }
    }

    @Override
    public void compete() {
        if (isInAlliance) {
            System.out.println(getName() + " competes with a powerful collaboration piece.");
        } else {
            System.out.println(getName() + " struggles to compete alone.");
        }
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and my most popular song is " + this.bestSong + ".";
    }

    @Override

    public void exitBus() {
        super.exitBus();
        System.out.println(getName() + " will rally our fans to victory!");
    }
}