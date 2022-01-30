class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int left,right,mid,index=-1,index1=-1;
        left=0;
        right=nums.length-1;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(nums[mid]>=target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            if(nums[mid]==target)
            {
                index=mid;
            }
        }
        arr[0]=index;
        left=0;
        right=nums.length-1;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(nums[mid]<=target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            if(nums[mid]==target)
            {
                index1=mid;
            }
        }
        arr[1]=index1;
        return arr;
        
    }
}
