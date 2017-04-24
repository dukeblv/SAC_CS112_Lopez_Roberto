
public class OddEvenGame {
	
	private int randomNum;
	
	public OddEvenGame(int compNum)
	{
		randomNum = compNum;
	}
	public int getRandomNumber(int compNum)
	{
		compNum = 1 + (int) (Math.random() * 10);
		return compNum;
	}
}
