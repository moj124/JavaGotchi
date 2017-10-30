
public class Creature {
    private int energy;
    private int fullness;
    private int happiness;
    private String name;

    public Creature(String name){
        energy = 15;
        fullness =15;
        happiness = 15;
        this.name = name;
    }
    public void eat(){
        if (fullness >= 12){
            System.out.println("Whoops," + this.getName() + " is already full.");
        }
        else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;
            if (fullness > 15) {
                this.fullness = 15;
            }
        }
        System.out.println("Yum, " + this.getName() + " I really enjoyed it.");
    }
    public void sleep(){

        if (energy>= 12){
            System.out.println("Whoops, " + this.getName() + " I'm not that sleepy.");
        }
        else {
            energy += 8;
            happiness -= 5;
            fullness -= 5;
            if (energy > 15) {
                this.energy = 15;
            }
        }
    }
    public String checkStatus(){
        String status="";
        if (happiness <=6){
            status +="Oh, "+this.getName() + " is feeling sad!\n";
        }
        if (energy <=6){
            status +="Hmm, "+this.getName() + " is feeling tired\n";

        }
        if (fullness<=6){
            status +="Whoops, "+this.getName() + " is feeling super hungry!";

        }
        return status;
    }
    public void play(){
        happiness+=8;
        energy -= 6;
        fullness -=4;
        if (happiness >15){this.happiness=15;}
        System.out.println("This was so much fun! Let's do it again!");
    }
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getFullness() {
        return fullness;

    }

    public int getHappiness() {
        return happiness;
    }
}
