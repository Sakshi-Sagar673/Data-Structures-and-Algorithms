import java.util.*;
public class SelectionSort{
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
		selectionSort(arr,size);
		System.out.println("Sorted array:");
		printArray(arr);
		
	}
		public static void selectionSort(int a[],int s)
		{
			int i,j,temp,min;
			for(i=0;i<s-1;i++)
			{
				min=i;
				for(j=i+1;j<s;j++)
				{
					if(a[j]<a[min])
					{
						min=j;
					}
				}
        //Swapping
				if(min!=i)
				{
					temp=a[i];
				    a[i]=a[min];
				    a[min]=temp;
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
		
				
