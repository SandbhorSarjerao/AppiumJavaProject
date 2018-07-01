
public class OneDArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//creating one D array
				int arr[] = new int[4];
				arr[0]=10;
				arr[1]=20;
				arr[2]=30;
				arr[3]=40;
				/*System.out.println(arr[2]);
				System.out.println(arr[0]);
				*///write for loop to print entire array
				
				//how to find out length of array or blocks in an array
				int blocks=arr.length;
				for(int i=0;i<blocks;i++)
				{
					System.out.println(arr[i]);
				}
	}

}
