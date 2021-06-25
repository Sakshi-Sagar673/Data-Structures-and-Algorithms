import java.util.*;
public class BubbleSort{
	public static void main(String args[])
	{
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:");
		printArray(arr);
		bubbleSort(arr,size);
		System.out.println("Sorted array:");
		printArray(arr);
		
	}
		public static void bubbleSort(int a[],int s)
		{
			int i,j,temp;
			for(i=0;i<s-1;i++)
			{
				for(j=0;j<s-1-i;j++)
				{
					if(a[j]>a[j+1])                         //Swapping
					{
						temp=a[j];
				        a[j]=a[j+1];
				        a[j+1]=temp;
				    }
				}
				
			}
		}
		public static void printArray(int a[])
		{
			int p;
			for(p=0;p<a.length;p++)
			{
			System.out.println(a[p]);
			}
		}
}
		
