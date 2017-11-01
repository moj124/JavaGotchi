import java.util.Scanner;
public class Game {
    Scanner scanner = new Scanner(System.in);
    Creature creature;
    boolean userQuits = false;

    public void run(){

        startTutorial();

        while(!userQuits) {
            interact();
        }
        System.out.println("Awh. Time to put " + this.creature.getName() +" to sleep.");
        System.out.println();
    }

    private  void  startTutorial(){

        System.out.println("Hi there! Welcome to Javagotchi.");
        System.out.println("What's the name of your creature?");

        String name = scanner.nextLine();
        this.creature = new Creature(name);

        System.out.println("Great, you can now meet " + this.creature.getName() + "!");
        System.out.println();
    }

    private void interact(){
        System.out.println("What would you like to do?");

        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                this.creature.play();
                System.out.println(this.creature.checkStatus());

                break;
            case 2:
                this.creature.eat();
                System.out.println(this.creature.checkStatus());

                break;
            case 3:
                System.out.println("How many hours would you like to sleep from 0 to 4 ?)");

                int option = scanner.nextInt();

                this.creature.sleep(option);
                System.out.println(this.creature.checkStatus());

                break;
            case 4:
                userQuits = true;
                break;
            default:
                System.out.println("Whoops, you have to pick a number between 1-4 (inclusive)");
                System.out.println(this.creature.checkStatus());
                break;
        }
        System.out.println();
    }

}
