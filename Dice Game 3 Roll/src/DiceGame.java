import java.util.Scanner;

public class DiceGame {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		int numDice = 0;
		int roll1 = 0;
		int roll2 = 0;
		int roll3 = 0;
		int diceRoll = 0;
		int again = 0;
		
		Dice s1 = new Dice(roll1, roll2, roll3);
		
		do{
			System.out.println("How many dices to you want to roll: Choose 1 to 3: ");
			numDice = input.nextInt();
		
			if (numDice == 1)
			{
				System.out.println("You chose to roll once dice, how many points will the dice roll: Choose 1-6: ");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll1);
			}
			if (numDice == 2)
			{
				System.out.println("You Chose to roll two dices, how many points will the dices roll: Choose 2-12: ");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll2);
			}
			if (numDice == 3)
			{
				System.out.println("You chose to roll three dices, how many point will the dices roll: Chose 3-18: ");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll3);
			}
		
			if (guess == diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d, You Win!",guess, diceRoll);
			}
			if (guess > diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d, Sorry you guessed too high",guess,diceRoll);
			}
			if (guess < diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d, Sorry your guess was too low",guess,diceRoll);
			}
			
			System.out.println("\nDo you want to play again? Enter (1) for yes or (0) for no: ");
			again = input.nextInt();
			
			if (again == 0)
			{
				System.out.println("Thank You for playing - Good-Bye");
			}
		}while(again == 1);
	}

}



