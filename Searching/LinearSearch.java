import java.util.*;
public class LinearSearch{
	public static void main(String args[])
	{
		int i,size,s,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number that you want to search:");
		s=sc.nextInt();
		result=linearSearch(arr,s);
		System.out.println(s+" is present at index "+result);
	}
	
		
		public static int linearSearch(int arr[],int search)
		{
			int p;
			for(p=0;p<arr.length;p++)
			{
				if(arr[p]==search)
				{
					break;
				}
			}
			return p;
		}
}
			
			
		
		
		
