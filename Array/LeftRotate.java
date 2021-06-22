import java.util.*;
public class LeftRotate
{
	public static void main(String args[])
	{
		int n,i,j,size,first;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		System.out.println("Enter the no of times u want to rotate array");
		n=sc.nextInt();
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
		//Rotate the given array by n times toward left  
		for(i=0;i<n;i++)                         
		{
			first=arr[0];
			for(j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			//First element of array will be added to the end
			arr[j]=first;                        
		}
		System.out.println();  
		System.out.println("Array after left rotation:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
		
		
