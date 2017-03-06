import java. util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		int sub;
		int mul;
		int div;
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		
		System.out.printf("The sum, subtraction, multiplication, and quotient of the two numbers is "
				+ "%d %d %d %d", sum, sub, mul, div);
}

}
