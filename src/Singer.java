public class Singer extends Musician {
    private boolean isKidnapped;
    private boolean isIncarcerated;

    public Singer(String name, boolean isKidnapped, boolean isIncarcerated) {
        super(name, "vocals");
        this.isKidnapped = isKidnapped;
        this.isIncarcerated = isIncarcerated;
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
}