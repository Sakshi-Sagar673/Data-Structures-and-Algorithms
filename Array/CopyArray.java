import java.util.*;
public class CopyArray
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Elements of original array are:");
		for(int j:arr1)
		{
			System.out.println(j);
		}
		for(i=0;i<n;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of new array are:");
		for(int j:arr2)
		{
			System.out.println(j);
		}
	}
}
		
