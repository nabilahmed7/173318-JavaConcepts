import javafx.scene.CacheHint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Alliens alliens = new Alliens();
        Wizards wizards = new Wizards();
        Warriors warriors = new Warriors();

        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int options;
        Characters[] characters = new Characters[5];
        try {
            while (tries < 5) {
                System.out.println("Please Select The Characters: ");
                System.out.println("1: Wizard \n 2: Warriors  ");
                options = scanner.nextInt();

                if (options == 1) {

                    System.out.print("Please Enter Wizard's Name: ");
                    wizards.name = scanner.next();
                    wizards.attack();
                    alliens.attack();
                    wizards.heal();
                    alliens.attack();
                    wizards.heal();
                    characters[tries] = wizards;

                }

                else if (options == 2) {

                    System.out.print("Please Enter Warrior's Name: ");
                    warriors.name = scanner.next();
                    warriors.attack();
                    alliens.attack();
                    characters[tries] = warriors;
                }

                tries++;

            }




        } catch (Exception e) {
            System.out.println("You Can Add Only Five Characters At A Time");

        }
        for (int i=0; i < characters.length; i++){
            System.out.println(characters[i].getClass().getName());
       }


    }
}
