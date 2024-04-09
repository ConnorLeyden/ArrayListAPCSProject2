// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Tester class to execute narrative program

import java.util.ArrayList;
public class Tester {
    static ArrayList<Musician> bus = new ArrayList<>();
    public static void main(String[] args) {
        decideContestants();
        boardTheBus();
        onTheBusCompetition();
        decideWhoProceeds();
        departure();
    }



    public static void decideContestants() {
        // Instantiating musicians with polymorphism.
        Musician yoYoMa = new Player("Yo-Yo Ma", "Cello", true);
        Musician louisArmstrong = new Player("Louis Armstrong", "Trumpet", true);
        Musician mozart = new Composer("Mozart", false);
        Musician beethoven = new Composer("Beethoven", false);
        Musician taylorSwift = new Singer("Taylor Swift", false, false);
        Musician elvisPresley = new Singer("Elvis Presley", false, false);
        Musician theBeatles = new Band("The Beatles", true);
        Musician u2 = new Band("U2", true);

        // Add the selected musicians to the bus.
        bus.add(yoYoMa);
        bus.add(louisArmstrong);
        bus.add(mozart);
        bus.add(beethoven);
        bus.add(taylorSwift);
        bus.add(elvisPresley);
        bus.add(theBeatles);
        bus.add(u2);

        System.out.println("Contestants from each neighborhood have been decided and added to the bus.");
    }

    public static void boardTheBus() {
        // Logic for musicians boarding the bus and their initial seating arrangement.
        System.out.println("Musicians are boarding the bus and finding their seats.");
    }

    public static void onTheBusCompetition() {
        // Describe the event where Steven drives the bus onto a race track, leading to a shuffle.
        System.out.println("A detour onto a race track leads to an unexpected shuffle among the musicians.");
    }

    public static void decideWhoProceeds() {
        // Logic for voting and deciding which musicians proceed to the final competition.
        System.out.println("The musicians vote, leading to some being voted off the bus.");
    }

    public static void departure() {
        // Describe the final scene where the remaining musicians find themselves at the wrong location.
        System.out.println("At the tournament grounds, a surprise twist leaves only Steven as the contestant.");
    }
}