import java.util.Random;
import java.util.Scanner;

public class CodSoftNumberGame {

    public static void main(String[] args){
        boolean task = true;
        while(task){
        System.out.print("Enter your guess from 1 to 100: ");
        
        Random random = new Random();
        int max=100; int min=1;
        int randNumber= random.nextInt(max-min+1)+min;

        Scanner user = new Scanner(System.in);

        for(int i=0; i<5; i++){
            int num = user.nextInt();
        
            if(num == randNumber){
            System.out.println("Correct Match");
            break;
            }
            else if(num < randNumber){
                System.out.println("Guess Higher");
            }
            else{
                System.out.println("Guess Lower");
            }
        }
        System.out.println("The system generated number is: "+ randNumber);
        System.out.println();
        System.out.println("Enter 1: Play Again");
        System.out.println("Enter 2: Exit the game");

        System.out.print("Enter your choice: ");
        int choose = user.nextInt();

        switch(choose){
            case 1: 
            break;

            case 2:
            System.out.println("Game Exit");
            task = false;
            break;

            default:
            System.out.println("Invalid Choice");
            task = false;
            break;
        }
      }
    } 
}
