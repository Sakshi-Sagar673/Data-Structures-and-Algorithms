class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
        int arr[]=new int[2];
        while(s<e)
        {
            if(numbers[s]+numbers[e]==target)
            {
                arr[0]=s+1;
                arr[1]=e+1;
                break;
            }
            else if(numbers[s]+numbers[e]<target)
            {
                s=s+1;
            }
            else
            {
                e=e-1;
            }
        }
        return arr;
    }
}
        
