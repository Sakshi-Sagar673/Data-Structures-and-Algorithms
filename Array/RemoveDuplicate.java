import java.util.*;
public class RemoveDuplicate
{
	public static void main(String args[])
	{
		int i,j=0,size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		int temp[]=new int[size];
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
		Arrays.sort(arr);//sorting array 
		//Removing duplicates
		for(i=0;i<size-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[size-1];
		System.out.println();
		System.out.println("Array after removing duplicates:");
		for(i=0;i<=j;i++)
		{
			System.out.print(temp[i]+ " ");
		}
	}
}
					
