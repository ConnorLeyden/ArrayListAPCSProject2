// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Tester class to execute narrative program

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println("First, the player neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top contestants:");
        ArrayList<Musician> playerNeighbourhood = new ArrayList<>();
        Musician mrHansen = new Player("Mr. Hansen", "Piano", false);
        Musician stevenXu = new Player("Steven Xu", "Saxophone", false);
        // Instantiating musicians with polymorphism.
        Musician yoYoMa = new Player("Yo-Yo Ma", "Cello", true);
        Musician louisArmstrong = new Player("Louis Armstrong", "Trumpet", true);
        playerNeighbourhood.add(mrHansen);
        playerNeighbourhood.add(stevenXu);
        playerNeighbourhood.add(yoYoMa);
        playerNeighbourhood.add(louisArmstrong);

        for (int i = 0; i < playerNeighbourhood.size(); i++) {
            playerNeighbourhood.get(i).chooseNeighbourhoodCompetitor();
        }

        for (int i = 0; i < playerNeighbourhood.size(); i++) {
            Musician musician = playerNeighbourhood.get(i);
            if (musician instanceof Player) {
                Player temp = (Player) musician;
                if (temp.getCanPlayFurElise()) {
                    bus.add(musician);
                    System.out.println(musician.getName() + " has made it onto the bus!");
                } else {
                    System.out.println(musician.getName() + " didn't make it onto the bus.");
                }
            }
        }
    }

    public static void decideContestantsBand() {
        System.out.println("Next, the band neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top contestants:");
        System.out.println("But wait... It's all out WAR in the band region");
        ArrayList<Musician> bandNeighbourhood = new ArrayList<>();
        Musician theBeatles = new Band("The Beatles", true, "Here Comes the Sun");
        Musician u2 = new Band("U2", true, "With Or Without You");
        Musician rollingStones = new Band("Rolling Stones", true, "(I Can't Get No) Satisfaction");
        bandNeighbourhood.add(theBeatles);
        bandNeighbourhood.add(u2);
        bandNeighbourhood.add(rollingStones);


        for (int i = 0; i < bandNeighbourhood.size(); i++) {
            bandNeighbourhood.get(i).chooseNeighbourhoodCompetitor();
        }

        for (int i = 0; i < bandNeighbourhood.size(); i++) {
            Musician musician = bandNeighbourhood.get(i);
            if (musician instanceof Band) {
                Band temp = (Band) musician;
                if (temp.getStatus()) {
                    bus.add(musician);
                    System.out.println(musician.getName() + " has made it onto the bus!");
                } else {
                    System.out.println(musician.getName() + " didn't make it onto the bus.");
                }
            }
        }


    }
    public static void decideContestantsSinger() {
        System.out.println("Next, the singer neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top contestants:");

        ArrayList<Musician> singerNeighbourhood = new ArrayList<>();
        Musician taylorSwift = new Singer("Taylor Swift", false, false, "Shake it Off");
        Musician elvisPresley = new Singer("Elvis Presley", false, false, "Can't Help Falling In Love");
        Musician bobMarley = new Singer("Bob Marley", true, false, "Could You Be Loved");
        Musician adele = new Singer("Adele", true, false, "Hello");
        Musician michaelJackson = new Singer("Adele", false, true, "Don’t Stop ’til You Get Enough");
        singerNeighbourhood.add(taylorSwift);
        singerNeighbourhood.add(elvisPresley);
        singerNeighbourhood.add(bobMarley);
        singerNeighbourhood.add(adele);
        singerNeighbourhood.add(michaelJackson);

        for (int i = 0; i < singerNeighbourhood.size(); i++) {
            singerNeighbourhood.get(i).chooseNeighbourhoodCompetitor();
        }

        for (int i = 0; i < singerNeighbourhood.size(); i++) {
            Musician musician = singerNeighbourhood.get(i);
            if (musician instanceof Singer) {
                Singer temp = (Singer) musician;
                if (temp.getStatus()) {
                    bus.add(musician);
                    System.out.println(musician.getName() + " has made it onto the bus!");
                } else {
                    System.out.println(musician.getName() + " didn't make it onto the bus.");
                }
            }
        }
    }

    public static void decideContestantsComposer() {
        System.out.println("Next, the Composer neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top contestants:");
        ArrayList<Musician> composerNeighbourhood = new ArrayList<>();
        Musician mozart = new Composer("Mozart", false, "Jupiter Symphony");
        Musician beethoven = new Composer("Beethoven", false, "Fifth Symphony");
        Musician brahms = new Composer("Johannes Brahms", true, "Third Symphony");
        Musician hansZimmer = new Composer("Hans Zimmer", true, "Dune Soundtrack");
        Musician bach = new Composer("Bach", true, "Mass in B minor");

        for (int i = 0; i < composerNeighbourhood.size(); i++) {
            composerNeighbourhood.get(i).chooseNeighbourhoodCompetitor();
        }

        for (int i = 0; i < composerNeighbourhood.size(); i++) {
            Musician musician = composerNeighbourhood.get(i);
            if (musician instanceof Composer) {
                Composer temp = (Composer) musician;
                if (!temp.getLockedStatus()) {
                    bus.add(musician);
                    System.out.println(musician.getName() + " has made it onto the bus!");
                } else {
                    System.out.println(musician.getName() + " didn't make it onto the bus.");
                }
            }
        }

    }

    public static void boardTheBus() {
        // Logic for musicians boarding the bus and their initial seating arrangement.
        System.out.println("Musicians are boarding the bus and finding their seats.");
    }

    public static void printTheBus() {
       for (int i = 0; i < bus.size(); i++) {
           System.out.println("" + i+1 + ".  " + bus.get(i));
       }
    }

    public static void onTheBusCompetition() {
        System.out.println("The musicians enter onto the bus and settle into their seats, oblivious to the hijacking that has occurred before them.");
        System.out.println("Despite their loud entries, the musicians now begin pondering which five should progress to the final tournament.");
        System.out.println("However, the bus begins shaking violently, and loud whirring sounds begin appearing all around the bus.");
        System.out.println("Everybody looks outside the bus to see what happened.");
        System.out.println("it turns out the bus is now in the middle of a Formula 1 race course!");
        System.out.println();

        System.out.println("In the front, Steven starts screaming");
        if (bus.get(0) instanceof Player) {
            Player temp = (Player) bus.get(0);
            temp.yellForHelp();
        }
            System.out.println();

        System.out.println("Somehow, Steven navigates the bus to the side of the road, but the sharp turns have caused disarray among the musicians, who find themsleves in completely different seats from before");
        Collections.shuffle(bus);
        System.out.println("The new seating arrangement is: \n");
        printTheBus();
        System.out.println("Musicians from different neighbourhoods responded to the emergency in different way");
        for (int i = 0; i < bus.size(); i++) {
            bus.get(i).reactToEmergency();
        }

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