class Solution {
    public void moveZeroes(int[] nums) {
        int s,f,i,temp;
        if(nums.length==1)
        {
            return;
        }
        s=0;
        f=1;
        while(s<nums.length && f<nums.length)
        {
            if(nums[s]==0 && nums[f]!=0)
            {
                temp=nums[s];
                nums[s]=nums[f];
                nums[f]=temp;
                s++;
                f++;
            }
            else if(nums[s]==0 && nums[f]==0)
            {
                f++;
            }
            else
            {
                s++;
                f++;
            }
        }
      
        
    }
}
