
public class IfElseStatement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i=50,j=40,k=30;
		
		if(i>j && i>k)
		{
		System.out.println("i is greater" + i);	
		}
		else if(j>i && j>k)
		{
			System.out.println("J is greater"+ j);
		}
		else
		{
			System.out.println("k is greater" + k);
		}
	}

}
