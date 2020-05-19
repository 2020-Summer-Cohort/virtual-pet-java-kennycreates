package virtual_pet;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

//look over fizz buzz for number randomization for DD wellness levels.
public class VirtualPetApplication {

    public static void main(String[] args) {
        Clock baseClock = Clock.systemDefaultZone();
        Instant instant = baseClock.instant();
        System.out.println("DD day cycle" + instant);
        Clock clock1 = Clock.tick(baseClock, Duration.ofSeconds(60));

        Scanner input = new Scanner(System.in);
        VirtualPet ddenergyLevel = new VirtualPet("Energy", "rest");
        VirtualPet ddHunger = new VirtualPet("Hunger", "feed");
        VirtualPet ddBond = new VirtualPet("Bond", "bond");
        VirtualPet ddIntelligence = new VirtualPet("Intelligence", "Take on mission");

        String showMenu = "\n\t Boss.. What do you want to do with DD?\n" + "\n\t" + "1.to let DD rest, restoring Energy" +
                "\n\t" +  "2. feed DD so he won't Hunger\n\t" + "3. spend time with DD and increase your Bond \n\t" +
                "4. take him on missions to raise his Intelligence. \n\t";

        String userSelection;
        while (ddenergyLevel.ddHunger()) {
            do {
                System.out.println(showMenu);
                userSelection = input.next();
            } while (userSelection.equals ("1") && userSelection.equals("2") && userSelection.equals("3")
            && userSelection.equals("4"));
             switch (userSelection){

                 case "1":
                     ddenergyLevel.energyLevelDD();
                     ddHunger.hungryDD();
                System.out.println("You let DD rest.. Make sure to feed him too.");
                    break;
                 case "2":
                ddHunger.feedDD();
                ddBond.bondDD();
                System.out.println("Good you fed DD, this will increase your bond for missions.");
                    break;
                 case "3":
                ddBond.bondDD();
                ddBond.bondDD();
                System.out.println("You spent time with DD, make sure you do this to keep " +
                        "your Bond with him.");
                    break ;
                 case "4":
                ddIntelligence.intelligentDD();
                ddHunger.hungryDD();
                ddenergyLevel.tiredDD();
                ddBond.bondDD();
                System.out.println("You took DD on a mission, let him rest and make sure you feed him too." +
                        "His" + "Intelligence rises along with your bond.");
                    break;
                 case "9":
                System.out.println("Boss. You're going out alone? Good luck Boss, I'll look after DD.");
                System.exit(0);
                    break;
            }
            // else
        }
        input.close();
    }

}

