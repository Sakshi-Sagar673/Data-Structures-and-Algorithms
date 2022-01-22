public class Solution {
    public int solve(int[] A, int B) {
        int i,min,max=0,mid,ans=0;
        for(i=0;i<A.length;i++)
        {
            max=Math.max(max,A[i]);
        }
        min=0;
        while(min<=max)
        {
            mid=min+(max-min)/2;
            long wood=0;
            for(int j=0;j<A.length;j++)
            {
                if(A[j]-mid>0)
                {
                    wood=wood+A[j]-mid;
                }
            }
            if(wood>=(long)B)
            {
                min=mid+1;
                ans=mid;
            }
            else{
                max=mid-1;
            }
        }
        return ans;
    }
}
