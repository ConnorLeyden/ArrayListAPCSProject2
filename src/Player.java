// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Player subclass

import java.util.ArrayList;
public class Player extends Musician {
    private boolean canPlayFurElise;

    public Player(String name, String instrument, boolean canPlayFurElise) {
        super(name, instrument);
        this.canPlayFurElise = canPlayFurElise;
    }

    @Override
    public void reactToEmergency() {
        System.out.println(getName() + " reacts to the emergency by " + (canPlayFurElise ? "calmly playing Fur Elise." : "panicking."));
    }

    @Override
    public void compete() {
        if (canPlayFurElise) {
            System.out.println(getName() + " competes by playing Fur Elise beautifully.");
        } else {
            System.out.println(getName() + " cannot play Fur Elise and does not compete.");
        }
    }

    @Override
    public void vote(ArrayList<Musician> musicians) {
        // Implementation of vote method
    }
}
