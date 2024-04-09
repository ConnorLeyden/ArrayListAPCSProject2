// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Band subclass of Musician class

import java.util.ArrayList;
public class Band extends Musician {
    private boolean isInAlliance;

    public Band(String name, boolean isInAlliance) {
        super(name, "band");
        this.isInAlliance = isInAlliance;
    }

    @Override
    public void reactToEmergency() {
        if (isInAlliance) {
            System.out.println(getName() + " collaborates with their allies to create a rhythmic response to the emergency.");
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
    public void vote(ArrayList<Musician> musicians) {
        // Implementation of vote method for Band
    }
}