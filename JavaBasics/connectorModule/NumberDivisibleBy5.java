
public class NumberDivisibleBy5 
{
	// 3) Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisble by 5 followd by that number'

	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(i % 5 == 0)
			{
				System.out.println(i + " is Divisble by 5");
			}
			else
				System.out.println(i);
		}

	}

}
