import java.util.*;
public class AscendingSort
{
	public static void main(String args[])
	{
		int i,j,temp=0,size;
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
     //Sort the array in ascending order    
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array sorted in ascending order:");
    //Displaying elements of array after sorting 
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
