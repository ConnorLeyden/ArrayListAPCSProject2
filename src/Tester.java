// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Tester class to execute narrative program

import java.util.ArrayList;
public class Tester {
    static ArrayList<Musician> bus = new ArrayList<>();
    public static void main(String[] args) {
        introduceNarrative();
        decideContestantsPlayer();
        decideContestantsComposer();
        decideContestantsSinger();
        decideContestantsBand();
        boardTheBus();
        onTheBusCompetition();
        decideWhoProceeds();
        departure();
    }

    public static void introduceNarrative() {
        System.out.println("Once upon a time in a land far far away...");
        System.out.println("There were several neighborhoods in which the musicians live: the player, composer, singer, and band neighborhoods.");
        System.out.println("Every year, a bus comes to each of the neighborhoods to take two musicians to compete in a grand tournament to determine who the best musician is in all neighbourhoods.");
        System.out.println("To decide who will go on the bus, the musicians from each neighbourhood will vote for two musicians that will progress to the grand bus.");
        System.out.println("Although a total of eight musicians will make it onto the bus, only five can exit, to be determined by a performance and subsequent vote on the bus.");
        System.out.println("Once the 5 remaining musicians get off the bus, they will undergo a final tournament watched by all people to decide the winner.");
        System.out.println();
        System.out.println();
        System.out.println("This is the story of one strange year, where the bus took turns that nobody expected...");
    }

    public static void decideContestantsPlayer() {

        Musician mrHansen = new Player("Mr. Hansen", "Piano", false);
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

    public static void decideContestantsBand() {

    }
    public static void decideContestantsSinger() {

    }

    public static void decideContestantsComposer() {

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