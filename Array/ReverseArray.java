import java.util.*;
public class ReverseArr
{
	public static void main(String args[])
	{
		int i,size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Reverse array:");
		for(i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
		
		
			
