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

    public String toString() {
        return "Hi! My name is " + getName() + " and I play the " + getInstrument() + ".";
    }

    public boolean isEligibleForBus() {
        return this.canPlayFurElise;
    }
    @Override
    public void chooseNeighbourhoodCompetitor() {
        System.out.println(this);
         if (getName().equals("Mr. Hansen")) {
             System.out.println("I think the top contestants should be determined based on a musician's contributions to education.");
         } else {
             System.out.println("I disagree with Mr. Hansen, I think the best players of Fur Elise should go on the bus");
         }
    }
    @Override
    public void reactToEmergency() {
        System.out.println("As " + getName() + ", I need to make sure my instrument is unharmed" + (canPlayFurElise ? ". I will now start playing Fur Elise." : "."));
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

    public void yellForHelp() {
        System.out.println("AAAAAAAAAAAAAAAAAAAA!!!!!!!!");
        System.out.println("I can't even drive, what do I do!");
    }

    @Override

    public void exitBus() {
        super.exitBus();
        System.out.println("I " + getName() + " am the best " + getInstrument() + "player and will win the competition");
    }
}
