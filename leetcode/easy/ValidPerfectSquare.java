class Solution {
    public boolean isPerfectSquare(int num) {
        long l,r,mid;
        l=0;
        r=num/2;
        if(num==0 || num==1)
            return true;
        
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid<num)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}
