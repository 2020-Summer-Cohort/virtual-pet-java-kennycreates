package virtual_pet;

public class VirtualPetDiamondDog {
    public String name;
    public int ddWellness;

    public VirtualPetDiamondDog(String name, int ddWellness) {
        this.name = name;
        this.ddWellness = ddWellness;
    }
    public void restDD() {
        ddWellness++;
    }
    public void hungryDD() {
        ddWellness++;
    }
    public void feedDD() {
        ddWellness--;
    }
    public void bondDD() {
        ddWellness++;
    }
    public void intelligentDD(){
        ddWellness ++;
    }
    public void tiredDD(){
        ddWellness --;
    }
    public String getName() {
        return name;
    }

   // public int getDdWellness() {


    }





