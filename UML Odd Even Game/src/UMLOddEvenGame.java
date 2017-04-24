import java.util.Scanner;

public class UMLOddEvenGame {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int compNum = 0;
		int guess = 0;
		int again = 0;
		OddEvenGame s1 = new OddEvenGame(compNum);
		
		System.out.println("Guess if the number generated by system is even or odd");
		
		do{
			for (int i = 1; i < 4; i++)
			{
				System.out.printf("Game %d\n",i);
		
				System.out.println("Enter 1 for even and 0 for odd: ");
				guess = input.nextInt();
				compNum = s1.getRandomNumber(compNum);
		
				if (guess == 1 && compNum % 2 == 0)
				{
					System.out.println("You Win");
				}
				if (guess == 1 &&  compNum % 2 != 0)
				{
					System.out.println("You Lose");
				}
				if (guess  == 0 && compNum % 2 == 1)
				{
					System.out.println("You Win");
				}
				if (guess == 0 && compNum % 2 != 1)
				{
					System.out.println("You Win");
				}
			}
				System.out.println("Play again? 1 for yes or 0 for no: ");
				again = input.nextInt();
				
				if (again == 0)
				{
					System.out.println("Thank You for playing - Good-Bye");
				}
		}while (again == 1);
	}
}
