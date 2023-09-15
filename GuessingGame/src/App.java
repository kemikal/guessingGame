import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // slumpa fram en siffra
        Random random = new Random();
        int answer = random.nextInt(100);
       
        // Håll koll på antalet försök
        int guesses = 0;
        int guess;

        // Starta spelet
        boolean run = true;

        while (run) {
            // Fråga om ett tal!
            System.out.println("Gissa talet! Säg en siffra mellan 0 och 100!");

                if (checkInt(input)) {
                    guesses++;

                    guess = input.nextInt();
                   

                    if (guess == answer) {
                        // Om rätt! Säg det! 
                        System.out.println("Ja! Rätt :) Du gissade " +  guesses + " gånger. Prova igen.");
                        
                        // Start om från början
                        guesses = 0;
                        answer = random.nextInt(100);
                    } else if (guess < answer) {
                        // Om får lågt!, säg det, fråga om nytt, berätta antalet försök
                        System.out.println("Fel, du gissade för lågt. Du har nu gissat " + guesses + " gånger.");

                    } else {
                        // Om får högt!, säg det, fråga om nytt, berätta antalet försök
                        System.out.println("Fel! du gissade för högt! Du har gissat " + guesses + " gånger!");
                    }
    
                    
                } else {
                    // Säg att de inte gissade på en siffra!
                    System.out.println("Nej! Säg en siffra mellan 0 och 100!");
                     input.nextLine();
                }
        }
    }

    // För att testa metoder så skapade vi en extra metod som returnerar true eller false till våran if i flödet.
    public static boolean checkInt(Scanner input) {

        if (input.hasNextInt()) {
            return true;
        } else {
            return false;
        }

    }

}
