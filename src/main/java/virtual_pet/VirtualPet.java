package virtual_pet;
import java.util.Random;

public class VirtualPet {
    public String petName;
    public int ddWellness;
    public int ddHunger;
    public int ddenergyLevel;
    public int ddBond;
    public int ddIntelligence;


    public VirtualPet(String name, String type, int energyLevel, int Hunger, int Bond, int Intelligence) {
        petName = name;
        ddHunger = ddHunger;
        ddenergyLevel = energyLevel;
        ddBond = Bond;
        ddIntelligence = Intelligence;
    }

    public VirtualPet(String name, String description) {
        this.ddenergyLevel = 70;
        this.ddHunger = 80;
        this.ddBond = 10;
        this.ddIntelligence = 30;
        this.ddWellness = ddWellness;

        class rand {
        }
        Random rand = new Random();

        rand.nextInt(100 - 10 + 1);
        rand.nextInt(91);
    }

    public String getPetName() {
        return petName;
    }

    public int getddenergyLevel() {
        return ddenergyLevel;
    }

    public int getddHunger() {
        return getddHunger();
    }

    public int energyLevelDD() {

        return ddenergyLevel++;
    }

    public int restDD() {
        return ddenergyLevel++;
    }

    public int hungryDD() {
        return ddHunger++;
    }

    public int feedDD() {
        return ddHunger--;
    }

    public int bondDD() {
        return ddBond++;
    }

    public int intelligentDD() {
        return ddIntelligence++;
    }

    public int tiredDD() {
        return ddenergyLevel--;
    }

    public void tick() {
        ddenergyLevel -= 80;
        ddHunger -= 40;
        ddBond -= 15;
        ddIntelligence -= 30;
    }

    public void rest() {
        ddenergyLevel += 20;
        ddHunger += 30;
    }

    public void feed() {
        ddHunger -= 40;
        ddBond += 10;
    }

    public void bond() {
        ddBond += 10;
        ddenergyLevel -= 10;
    }

    public void intelligence() {
        ddBond += 20;
        ddIntelligence += 20;
        ddHunger += 30;
        ddenergyLevel -= 40;
    }

    public String getName() {
        return petName;
    }

    public boolean ddHunger() {
        return ddWellness();
    }


}





