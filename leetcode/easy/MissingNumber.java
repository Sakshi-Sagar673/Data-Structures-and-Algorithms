class Solution {
    public int missingNumber(int[] nums) {
        int s=0,temp,res=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
        }
        temp=nums.length;
        res=((temp*(temp+1))/2)-s;
        return res;
        
        
    }
}
