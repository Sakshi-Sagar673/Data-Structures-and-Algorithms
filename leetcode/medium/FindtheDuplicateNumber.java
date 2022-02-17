class Solution {
    public int findDuplicate(int[] nums) {
        int l,r,mid,ans=0,count;
        l=1;
        r=nums.length-1;
        while(l<=r)
        {
            count=0;
            mid=l+(r-l)/2;
            for(int i:nums)
            {
                if(i<=mid)
                    count++;
            }
            if(count>mid)
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}
