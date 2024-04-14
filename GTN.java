package GTN;
import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);
    
    Random rd = new Random();
    int r = rd.nextInt(100); 

    Game(){
        System.out.println("Please enter your guess:");
        for(int x=0;x<999;x++){
        int i = sc.nextInt();
        if(i>r){
            System.out.println("Lower");
        }
        else if(i<r){
            System.out.println("Higher");
        }
        else {
            System.out.println("Correct");
            System.out.println("The number was: " + r);
            System.out.println("No of guesses: " + (x+1));
            break;
        }
        }
    }

}

public class GTN {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Game GTN = new Game();
        
    }
}
