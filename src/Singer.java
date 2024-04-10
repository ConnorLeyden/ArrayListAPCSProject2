// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Singer subclass of Musician class

import java.util.ArrayList;
public class Singer extends Musician {
    private boolean isKidnapped;
    private boolean isIncarcerated;

    public String bestSong;

    public Singer(String name, boolean isKidnapped, boolean isIncarcerated, String bestSong) {
        super(name, "vocals");
        this.isKidnapped = isKidnapped;
        this.isIncarcerated = isIncarcerated;
        this.bestSong = bestSong;
    }

    @Override
    public void reactToEmergency() {
        if (isKidnapped) {
            System.out.println(getName() + " cannot react, they are kidnapped.");
        } else if (isIncarcerated) {
            System.out.println(getName() + " is in jail and cannot react.");
        } else {
            System.out.println(getName() + " sings a calming melody.");
        }
    }

    public boolean getStatus() {
        return !(this.isIncarcerated || this.isKidnapped);
    }
    public void chooseNeighbourhoodCompetitor() {
        System.out.println(this);
        if (this.isKidnapped) {
            System.out.println("Please help me! I have been kidnapped by a mob of Swifties and cannot escape!");
        } else if (this.isIncarcerated) {
            System.out.println("I am in prison and will not be able to make the bus");
        } else {
            if (getName().equals("Taylor Swift")) {
                System.out.println("My fans have secured my place on the bus! I love my fans!");
            } else {
                System.out.println("I don't know how, but I have escaped the mob of Swifties!");
            }
        }
    }

    @Override
    public void compete() {
        if (!isKidnapped && !isIncarcerated) {
            System.out.println(getName() + " competes by performing their hit song.");
        } else {
            System.out.println(getName() + " cannot compete due to their situation.");
        }
    }

    @Override
    public void vote(ArrayList<Musician> musicians) {
        // Implementation of vote method for Singer
    }

    public String toString() {
        return "My name is " + getName() + " and my most popular song is " + this.bestSong + ".";
    }
}