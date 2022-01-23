public class Solution {
    public int solve(int[] A, int B) {
        int lo,hi,mid,count=0;
        lo=0;
        hi=A.length-1;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(A[mid]<=B)
            {
                count=mid+1;
                lo=mid+1;
            }
            else
            hi=mid-1;
        }
        return count;
    }
}
