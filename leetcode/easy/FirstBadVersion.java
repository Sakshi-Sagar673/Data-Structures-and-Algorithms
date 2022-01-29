/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left,right,mid,temp=n;
        left=1;
        right=n;
        boolean res;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            res=isBadVersion(mid);
            if(res==true)
            {
                temp=mid;
                right=mid-1;
            }
            else
                left=mid+1;       
        }
      return temp;  
    }
}
