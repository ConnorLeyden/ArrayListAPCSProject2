// Connor Leyden and Jay Chadwick
// Due 04122024 FRI
// Purpose: Tester class to execute narrative program

import java.util.ArrayList;
import java.util.Collections;
public class Tester {
    static ArrayList<Musician> bus = new ArrayList<>();
    public static void main(String[] args) {
        introduceNarrative();
        boardTheBus();
        createChaosOnBus();
        decideWhoProceeds();
        departure();
    }
    public static void boardTheBus() {
        ArrayList<Musician> playerArrayList = decideContestantsPlayer();
        ArrayList<Musician> composerArrayList = decideContestantsComposer();
        ArrayList<Musician> singerArrayList = decideContestantsSinger();
        ArrayList<Musician> bandArrayList = decideContestantsBand();
        System.out.println("Musicians are boarding the bus and finding their seats.");
        seatCandidatesOnBus(playerArrayList, 1);
        seatCandidatesOnBus(composerArrayList, 2);
        seatCandidatesOnBus(singerArrayList, 3);
        seatCandidatesOnBus(bandArrayList, 4);
        bus.addAll(bandArrayList);
        bus.addAll(composerArrayList);
        bus.addAll(singerArrayList);
        bus.addAll(playerArrayList);
    }
    public static void seatCandidatesOnBus(ArrayList<Musician> musicianList, int r){
        int c = 1;
        for (int i = 0; i < musicianList.size(); i++) {
            (musicianList.get(i)).getOnBus();
            if (musicianList.get(i).getName().equals("Steven Xu")){
                c--;
                System.out.println(musicianList.get(i).getName() + " sits in the driver's seat, wearing a disguise.");
            } else if (r == 2) {
                if (c == 1) {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "nd row to the left.");
                } else {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "nd row to the right.");
                }
            } else if (r == 3) {
                if (c == 1) {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "rd row to the left.");
                } else {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "rd row to the right.");
                }
            } else if (r == 4) {
                if (c == 1) {
                    System.out.println(musicianList.get(i).getName() + " sit in the " + r + "th row to the left.");
                } else {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "th row to the right.");
                }
            } else {
                if (c == 1) {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "st row to the left.");
                } else {
                    System.out.println(musicianList.get(i).getName() + " sits in the " + r + "st row to the right.");
                }
            }
            c++;
        }
        System.out.println();
    }
    private static ArrayList<Musician> evaluateAndAddMusiciansToBus(ArrayList<Musician> neighbourhood) {
        for (Musician musician : neighbourhood) {
            musician.chooseNeighbourhoodCompetitor();
        }
        for (int i = 0; i < neighbourhood.size(); i++) {
            if (neighbourhood.get(i).isEligibleForBus()) {
                System.out.println(neighbourhood.get(i).getName() + " has made it onto the bus!");
            } else {
                System.out.println(neighbourhood.get(i).getName() + " didn't make it onto the bus.");
                neighbourhood.remove(i);
                i--;
            }
        }
        return neighbourhood;
    }

    public static void introduceNarrative() {
        System.out.println("Once upon a time in a land far far away...");
        System.out.println("There were several neighborhoods in which the musicians live: the player, composer, " +
                "singer, and band neighborhoods.");
        System.out.println("Every year, a bus comes to each of the neighborhoods to take two musicians to compete" +
                " in a grand tournament to determine who the best musician is in all neighbourhoods.");
        System.out.println("To decide who will go on the bus, the musicians from each neighbourhood will vote for" +
                " two musicians that will progress to the grand bus.");
        System.out.println("Although a total of eight musicians will make it onto the bus, only five can exit, to" +
                " be determined by a performance and subsequent vote on the bus.");
        System.out.println("Once the 5 remaining musicians get off the bus, they will undergo a final tournament " +
                "watched by all people to decide the winner.");
        System.out.println("This is the story of one strange year, where the bus took turns that nobody expected...");
        System.out.println();
    }

    public static ArrayList<Musician> decideContestantsPlayer() {
        System.out.println("First, the player neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the" +
                " top contestants:");
        ArrayList<Musician> playerNeighbourhood = new ArrayList<>();
        Musician mrHansen = new Player("Mr. Hansen", "Piano", false);
        Musician stevenXu = new Player("Steven Xu", "Saxophone", false);
        Musician yoYoMa = new Player("Yo-Yo Ma", "Cello", true);
        Musician louisArmstrong = new Player("Louis Armstrong", "Trumpet", true);
        playerNeighbourhood.add(mrHansen);
        playerNeighbourhood.add(stevenXu);
        playerNeighbourhood.add(yoYoMa);
        playerNeighbourhood.add(louisArmstrong);
        evaluateAndAddMusiciansToBus(playerNeighbourhood);
        bus.add(0, stevenXu);
        System.out.println("Steven Xu hijacks the bus while the driver is off.");
        System.out.println();
        return playerNeighbourhood;
    }

    public static ArrayList<Musician> decideContestantsBand() {
        System.out.println("Next, the band neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top" +
                " contestants:");
        System.out.println("But wait... It's all out WAR in the band region");
        ArrayList<Musician> bandNeighbourhood = new ArrayList<>();
        Musician theBeatles = new Band("The Beatles", true, "Here Comes the Sun");
        Musician u2 = new Band("U2", true, "With Or Without You");
        Musician rollingStones = new Band("Rolling Stones", false, "(I Can't Get No)" +
                " Satisfaction");
        bandNeighbourhood.add(theBeatles);
        bandNeighbourhood.add(u2);
        bandNeighbourhood.add(rollingStones);
        evaluateAndAddMusiciansToBus(bandNeighbourhood);
        System.out.println();
        return bandNeighbourhood;
    }
    public static ArrayList<Musician> decideContestantsSinger() {
        System.out.println("Next, the singer neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose" +
                " the top contestants:");
        ArrayList<Musician> singerNeighbourhood = new ArrayList<>();
        Musician taylorSwift = new Singer("Taylor Swift", false, false,
                "Shake it Off");
        Musician elvisPresley = new Singer("Elvis Presley", false, false,
                "Can't Help Falling In Love");
        Musician bobMarley = new Singer("Bob Marley", true, false,
                "Could You Be Loved");
        Musician adele = new Singer("Adele", true, false, "Hello");
        Musician michaelJackson = new Singer("Michael Jackson", false, true,
                "Don’t Stop ’til You Get Enough");
        singerNeighbourhood.add(taylorSwift);
        singerNeighbourhood.add(elvisPresley);
        singerNeighbourhood.add(bobMarley);
        singerNeighbourhood.add(adele);
        singerNeighbourhood.add(michaelJackson);
        evaluateAndAddMusiciansToBus(singerNeighbourhood);
        System.out.println();
        return singerNeighbourhood;
    }

    public static ArrayList<Musician> decideContestantsComposer() {
        System.out.println("Next, the Composer neighbourhood must decide its two top contestants");
        System.out.println("Here is each musician to introduce themselves and decide the best way to choose the top" +
                " contestants:");
        ArrayList<Musician> composerNeighbourhood = new ArrayList<>();
        Musician mozart = new Composer("Mozart", true, "Jupiter Symphony");
        Musician beethoven = new Composer("Beethoven", true, "Fifth Symphony");
        Musician brahms = new Composer("Brahms", false, "Third Symphony");
        Musician hansZimmer = new Composer("Hans Zimmer", false, "Dune Soundtrack");
        Musician bach = new Composer("Bach", false, "Mass in B minor");
        composerNeighbourhood.add(mozart);
        composerNeighbourhood.add(beethoven);
        composerNeighbourhood.add(brahms);
        composerNeighbourhood.add(hansZimmer);
        composerNeighbourhood.add(bach);
        evaluateAndAddMusiciansToBus(composerNeighbourhood);
        System.out.println();
        return composerNeighbourhood;
    }

    public static void printTheBus() {
        int seat = 0;
        for (int i = 2; i < bus.size()+1; i++) {
            if (seat % 2 == 0) {
                System.out.println(bus.get(i-1).getName() + " sits in row " + i/2 + " on the left.");
            } else {
                System.out.println(bus.get(i-1).getName() + " sits in row " + i/2 + " on the right.");
            }
            seat++;
        }
        System.out.println();
    }

    public static void createChaosOnBus() {
        System.out.println("The musicians enter onto the bus and settle into their seats, oblivious to the hijacking" +
                " that has occurred before them.");
        System.out.println("However, the bus begins shaking violently, and loud whirring sounds begin appearing all " +
                "around them.");
        System.out.println("Everybody looks outside the bus to see what happened.");
        System.out.println("it turns out the bus is now in the middle of a Formula 1 race course!");
        System.out.println();
        System.out.println("In the front, the wild driver starts screaming");
        if (bus.get(0) instanceof Player) {
            Player temp = (Player) bus.get(0);
            temp.yellForHelp();
        }
        System.out.println();
        System.out.println("Somehow, the wild driver navigates the bus to the side of the road, " +
                "but the sharp turns have caused disarray among the musicians, who find themselves" +
                " in completely different seats from before");
        Musician temp = bus.get(0);
        bus.remove(0);
        Collections.shuffle(bus);
        bus.add(0, temp);
        System.out.println("The new seating arrangement is: \n");
        printTheBus();
        System.out.println("Musicians from different neighbourhoods responded to the emergency in different way");
        for (int i = 1; i < bus.size(); i++) {
            bus.get(i).reactToEmergency();
        }
        System.out.println();
    }

    public static void decideWhoProceeds() {
        System.out.println("The musicians vote, leading to some being voted off the bus.");
        for (int i = 0; i < bus.size(); i++) {
            if(bus.get(i).getName().equals("Elvis Presley")) {
                System.out.println(bus.get(i).getName() + " accidentally falls out of the emergency exit while" +
                        " fighting with Beethoven");
                bus.remove(i);
                i--;
            } if (bus.get(i).getName().equals("Beethoven")) {
                System.out.println(bus.get(i).getName() + " is pushed out of the emergency exit" +
                        " by Taylor Swift.");
                bus.remove(i);
                i--;
            } if (bus.get(i).getName().equals("U2")) {
                System.out.println(bus.get(i).getName() + " is voted out by Louis Armstrong, " +
                        "the Beatles, and Yo-Yo Ma.");
                bus.remove(i);
                i--;
            }
        }
        System.out.println();
        System.out.println("The final candidates are: ");
        for (int j = 1; j < bus.size(); j++) {
            if (j == (bus.size()-1)) {
                System.out.println("and " + bus.get(j).getName() + ".");
            } else {
                System.out.print(bus.get(j).getName() + ", ");
            }
        }
        System.out.println();
    }

    public static Musician determineWinner() {
        int randomInt = (int) (Math.random() * bus.size());
        return bus.get(randomInt);
    }
    public static void departure() {
        System.out.println("As the contestants reach the tournament grounds, each musician steps off with a few" +
                " remarks.");
        for (int i = 1; i < bus.size(); i++) {
            bus.get(i).exitBus();
        }
        System.out.println();
        System.out.println("Suddenly, the bus turns the other direction and runs off.");
        System.out.println("The musicians start running and shouting after it.");
        for (int i = 1; i < bus.size(); i++) {
            System.out.println(bus.get(i).toString() + " I command you to return here now or face the wrath of my" +
                    " music!");
            bus.remove(i);
            i--;
        }
        System.out.println();
        System.out.println("After a while, the wild driver arrived and reveals himself as Steven Xu, the saxophone" +
                " player!");
        System.out.println("As he is the only one, a *very* short vote commences.");
        System.out.println("AND the WINNER is...");
        System.out.println(determineWinner().getName());
        System.out.println("Steven celebrated by playing Fur Elise poorly.\n");
        System.out.println("That is how a little known musician finally won the great music festival!");
    }
}