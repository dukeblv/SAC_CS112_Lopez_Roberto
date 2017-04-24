
public class Dice {

	private int diceRoll1;
	private int diceRoll2;
	private int diceRoll3;
	
	public Dice(int roll1, int roll2, int roll3)
	{
		diceRoll1 = roll1;
		diceRoll2 = roll2;
		diceRoll3 = roll3;
	}
	public int getDiceRoll1(int roll1)
	{
		roll1 = 1 + (int) (Math.random() * 6);
		return roll1;
	}
	public int getDiceRoll2(int roll2)
	{
		roll2 = 2 + (int) (Math.random() * 12);
		return roll2;
	}
	public int getDiceRoll3(int roll3)
	{
		roll3 = 3 + (int) (Math.random() * 18);
		return roll3;
	}
}


