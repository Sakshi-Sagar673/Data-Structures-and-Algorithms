class Solution {
    public int findPeakElement(int[] nums) {
        int left,right,mid;
        left=0;
        right=nums.length-1;
        if(nums.length==1)
            return 0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid])
                    return mid;
                else if(nums[mid-1]>nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else if(mid==0)
            {
                if(nums[0]>nums[1])
                    return 0;
                else
                    return 1;
            }
            else if(mid==nums.length-1)
            {
                if(nums[mid]>nums[mid-1])
                    return mid;
                else
                    return mid-1;
            }
        }
      return -1;  
    }
}
