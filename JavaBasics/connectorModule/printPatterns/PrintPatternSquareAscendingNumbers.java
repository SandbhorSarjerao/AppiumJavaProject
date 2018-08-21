package printPatterns;

public class PrintPatternSquareAscendingNumbers 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=4 ; i++ )
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(j>=i)
				{
					System.out.print(i);
				}
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
