public class Solution {
    public int solve(int[] A, int B) {
        int f,l,mid,index,res;
        f=0;
        l=A.length-1;
        index=findPeakElement(A,f,l);
        res=ascBinarySearch(A,f,index-1,B);
        if(res==-1)
        {
            res=descBinarySearch(A,index,l,B);
        }
        if(res!=-1)
        return res;
        else
        return -1;

    }
    public int findPeakElement(int[] A,int low,int high)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mid>0 && mid<high)
            {
                if(A[mid]>A[mid-1]&&A[mid]>A[mid+1])
                return mid;
                else if(A[mid]>A[mid-1])
                low=mid+1;
                else
                high=mid-1;
            }
            else if(mid==0)
            {
                if(A[mid]>A[mid+1])
                return mid;
                else
                return mid+1;
            }
            else if(mid==high)
            {
                if(A[mid]>A[mid-1])
                return mid;
                else
                return mid-1;
            }
        }
        return -1;
    }
    public int ascBinarySearch(int A[],int low,int high,int num)
    {
        int mi;
        while(low<=high)
        {
            mi=low+(high-low)/2;
            if(A[mi]==num)
            return mi;
            else if(A[mi]>num)
            high=mi-1;
            else
            low=mi+1;
        }
        return -1;
    }
    public int descBinarySearch(int A[],int low,int high,int num)
    {
        int mi;
        while(low<=high)
        {
            mi=low+(high-low)/2;
            if(A[mi]==num)
            return mi;
            else if(A[mi]>num)
            low=mi+1;
            else
            high=mi-1;
        }
        return -1;
    }
}
