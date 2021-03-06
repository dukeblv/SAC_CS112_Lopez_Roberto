import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			Random generator = new Random();
			
			int play = 0; // Hold for integer values inputed by user.
			int compNum; // Hold for integer values generated by computer.
			
			System.out.println("Let's play Rock, Paper, Scissors\n"
					+ "Please enter (1)for Rock, (2)Paper, or (3) Scissors: "); // Prompt user for input.
			
			play = input.nextInt(); // Read in input from user.
			
			compNum = generator.nextInt(3); // Random number generator.
			
			if (compNum == 1 && play == 1) // Conditional Statement if user choice is 1 (Rock).
			{
				System.out.println("Rock vs Rock - It's a Tie!");
			}
			else if (compNum == 1 && play == 2)
			{
				System.out.println("Rock vs Paper - You Win!");
			}
			else if (compNum == 1 && play == 3)
			{
				System.out.println("Rock vs Scissors - You Lost!");
			}
				
			if (compNum == 2 && play == 1) // Conditional Statement if user choice is 2 (Paper).
			{
				System.out.println("Paper vs Rock - You Lost!");
			}
			else if (compNum == 2 && play == 2)
			{
				System.out.println("Paper vs Paper - It's a Tie!");
			}
			else if (compNum == 2 && play == 3)
			{
				System.out.println("Paper vs Scissors - You Won!");
			}
				
			if (compNum == 3 && play == 1) // Conditional Statement if user choice is 3 (Scissors).
			{
				System.out.println("Scissors vs Rock - You Won!");
			}
			else if (compNum == 3 && play == 2)
			{
				System.out.println("Scissors vs Paper - You Lost!");
			}
			else if (compNum == 3 && play == 3)
			{
				System.out.println("Scissors vs Scissors - It's a Tie!");
			}
				
			if (play < 0 || play > 3) // Conditional Statement for invalid entries. Input must be 1, 2, or 3.
			{
				System.out.println("Entry is invalid!");
				System.exit(0); // Exits application.
			}
		}
}

