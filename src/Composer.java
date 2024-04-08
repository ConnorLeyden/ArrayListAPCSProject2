// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Composer subclass of Musician class
public class Composer extends Musician {
    private boolean isLockedInHouse;

    public Composer(String name, boolean isLockedInHouse) {
        super(name, "composition");
        this.isLockedInHouse = isLockedInHouse;
    }

    @Override
    public void reactToEmergency() {
        if (isLockedInHouse) {
            System.out.println(getName() + " is locked in and cannot react to the emergency.");
        } else {
            System.out.println(getName() + " starts composing a 'race' themed symphony.");
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
}