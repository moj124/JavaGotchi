package com.company;
import java.util.Scanner;

public class Creature {
    private Scanner scanner = new Scanner(System.in);
    private int energy;
    private int fullness;
    private int happiness;
    private String name;

    public Creature(String name) {
        energy = 10;
        fullness = 10;
        happiness = 10;
        this.name = name;
    }

    public void eat() {

        System.out.println("What would you like to feed " + this.getName() + " ?");

        System.out.println("1. An apple");
        System.out.println("2. A large pizza");
        System.out.println("3. An entire jar of Nutella");
        System.out.println("4. Steak and fries");
        System.out.println("5. McDonalds Happy Meal");
        System.out.println("6. A wrap from Pret");
        int chosenNum = scanner.nextInt();

        switch (chosenNum) {
            case 1:
                fullness += 2;
            case 2:
                fullness += 9;
            case 3:
                fullness += 5;
                happiness += 2;
            case 4:
                fullness += 7;
            case 5:
                fullness += 6;
                happiness -= 3;
            case 6:
                fullness += 4;
        }

        if (fullness >= 12) {
            System.out.println("Whoops," + this.getName() + " is already full.");
        }
        else {
            happiness -= 6;
            energy -= 4;
            if (fullness > 15) {
                this.fullness = 15;
            }
        }
        System.out.println("Yum, " + this.getName() + " really enjoyed it.");
        System.out.println();
    }

    public void sleep(int hours) {

        if (energy >= 12) {
            System.out.println("Whoops, " + this.getName() + " is not that sleepy.");
            System.out.println();
        }
        else {
            energy = hours * 2 + energy;
            happiness = energy - (hours + 2);
            fullness = fullness - (hours + 1);
            if (energy > 15) {
                this.energy = 15;
            }
        }
    }

    public String checkStatus(){
        String status = "";
        //System.out.println("Fullness: " + fullness);
        //System.out.println("Energy: " + energy);
        //System.out.println("Happiness " + happiness);
        if(fullness <= 0 || happiness <= 0 || energy <= 0){
            status += "Oh no! " + this.getName() + " is dead. You're a terrible owner!";
        }
        else{
            if (happiness <= 6){
                status +="Oh, "+this.getName() + " is feeling sad!\n";
            }
            if (energy <= 6){
                status +="Hmm, "+this.getName() + " is feeling tired\n";
            }
            if (fullness<= 6){
                status +="Whoops, "+this.getName() + " is feeling super hungry!\n";
            }
        }

        System.out.println();
        return status;
    }
    public void play(){

        happiness+=8;
        energy -= 6;
        fullness -=4;

        if (happiness >15){this.happiness=15;}
        System.out.println("This was so much fun! Let's do it again!");
        System.out.println();
    }
    public String getName() {

        return name;
    }
}

