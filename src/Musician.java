// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Musician superclas
import java.util.ArrayList;
public class Musician {
    private String name;
    private String instrument;
    private boolean isOffBus = false;

    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public Musician(String name) {
        this.name = name;
    }
    public void chooseNeighbourhoodCompetitor() { }

    public void getOnBus() {
        System.out.println(name + " gets on the bus with their " + instrument + ".");
    }

    public void exitBus() {
        System.out.println(name + " is exiting the bus.");
        this.isOffBus = true;
    }

    // Since we can't have abstract methods, provide a default implementation.
    public void reactToEmergency() {
        System.out.println(name + " does not know how to react to the emergency!");
    }

    // Provide a default implementation for compete.
    public void compete() {
        System.out.println(name + " competes in their own unique way.");
    }

    // Provide a default implementation for vote.
    public void vote(ArrayList<Musician> musicians) {
        System.out.println(name + " has a unique way of voting.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Musician musician = (Musician) obj;
        return name.equals(musician.name);
    }

    @Override
    public String toString() {
        return "Musician{name='" + name + "', instrument='" + instrument + "'}";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public boolean isOffBus() {
        return isOffBus;
    }

    public void setOffBus(boolean offBus) {
        isOffBus = offBus;
    }
}