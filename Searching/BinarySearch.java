import java.util.*;
public class BinarySearch{
	public static void main(String args[])
	{
		int i,size,s;
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
		binarySearch(arr,size,s);
	}
				
		public static void binarySearch(int arr[],int n,int search)
		{
			int l,r,mid;
			l=0;
			r=n-1;
			mid=(l+r)/2;
			while(l<=r)
			{
				if(arr[mid]==search)
				{
					System.out.println("Element is found at location "+(mid+1));
					break;
				}
				else if(arr[mid]>search)
				{
					r=mid-1;
				}
				else
				{
					l=mid+1;
				}
				mid=(l+r)/2;
			}
			if(l>r)
			{
				System.out.println("Element not found");
			}
		}
}
					
			
