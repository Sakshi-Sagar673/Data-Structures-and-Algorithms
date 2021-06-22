import java.util.*;
public class Duplicate
{
	public static void main(String args[])
	{
		int i,j,size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate elements:");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size-1;j++)
			{
				if(arr[j]==arr[i])
				{
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
}
