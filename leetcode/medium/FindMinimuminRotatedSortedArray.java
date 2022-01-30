class Solution {
    public int findMin(int[] nums) {
        int left,right,mid;
        left=0;
        right=nums.length-1;
        if(nums[left]<=nums[right])
            return nums[left];
       while(left<=right)
       {
           mid=left+(right-left)/2;
           if(mid>0 && nums[mid]<nums[mid-1])
               return nums[mid];
           else if(mid<nums.length-1 && nums[mid]>nums[mid+1])
               return nums[mid+1];
           else if(nums[left]<=nums[mid])
               left=mid+1;
           else if(nums[mid]<=nums[right])
               right=mid-1;
       }
      return -1;  
    }
}
