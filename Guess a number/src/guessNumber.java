import java.text.NumberFormat;
import java.util.Scanner;

public class guessNumber {
	
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			int userNum = 0;
			int compNum = 0;
			int goodGuesses = 0;
			int badGuesses = 0;
			int count = 0;
			int round = 1;
			int again = 0;
			float roundPer = 0;
			float gamePer = 0;
	
			System.out.println("You will have 3 tries per round to guess a number from 1 to 10");
			do{
				System.out.printf("Round %d\n",round);
				for (int i = 0; i < 3; i++)
				{
					System.out.printf("Game %d: ",(i + 1));
					userNum = input.nextInt();
					compNum = 1 + (int) (Math.random() * 10);
			
					if (userNum == compNum)
					{
					System.out.println("Congratulations! You guessed correctly");
					goodGuesses++;
					}
					if (userNum != compNum)
					{
						System.out.println("Sorry you guessed incorrectly");
						badGuesses++;
					}
					count++;
					}
				
				System.out.printf("The number of correct guesses: %d\n",goodGuesses);
				
				System.out.printf("The number of incorrect guesses: %d\n",badGuesses);
				
				roundPer = (float) ((goodGuesses * 100) / 3);
				
				System.out.print("Your guess percentage for round " + round + " is " + roundPer + "%\n");
				round++;
				
				gamePer = (float) ((goodGuesses * 100) / count);
				System.out.print("Your overall guess percentage is " + gamePer + "%\n");
				
				System.out.printf("Do you want to play again? (1)yes or (0)No: \n");
				again = input.nextInt();
				
				if (again == 0)
				{
					System.out.println("Thank you for playing, Good-bye!");
				}
			}while(again == 1);
		}
}
				
		
