import java.util.*;
public class Frequency
{
	public static void main(String args[])
	{
		int n,i,j,count,visited=-1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		//Array freq will store frequencies of element 
		int freq[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=-1;       //To avoid counting same element again  
				}
			}
			if(freq[i]!=-1)
			{
				freq[i]=count;
			}
		}
		 //Displays the frequency of each element present in array 
		System.out.println("---------------------------------------"); 
		System.out.println(" Element | Frequency");  
		System.out.println("---------------------------------------"); 
		for( i = 0; i < n; i++){  
			if(freq[i] != -1)  
				System.out.println("    " + arr[i] + "    |    " + freq[i]);  
		}  
		System.out.println("----------------------------------------");   
		    
	}
}
		
					
					
		
