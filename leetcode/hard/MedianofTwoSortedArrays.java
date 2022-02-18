class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0,temp;
        double med;
        double arr[]=new double[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
         while(j<nums2.length)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        if(arr.length%2==1)
        {
            temp=(arr.length+1)/2;
            med=arr[temp-1];
        }
        else
        {
            temp=(arr.length/2);
            med=(arr[temp-1]+arr[temp])/2;
        }
        return med;
    }
}

//optimised solution

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if(nums2.length<nums1.length)
           return findMedianSortedArrays(nums2,nums1);
        int s1,s2,l1,l2,r1,r2,lo,hi,mid1,mid2;
        s1=nums1.length;
        s2=nums2.length;
        lo=0;
        hi=s1;
        while(lo<=hi)
        {
            mid1=lo+(hi-lo)/2;
            mid2=(s1+s2+1)/2-mid1;
            
            l1=mid1==0?Integer.MIN_VALUE:nums1[mid1-1];
            l2=mid2==0?Integer.MIN_VALUE:nums2[mid2-1];
            
            r1=mid1==s1?Integer.MAX_VALUE:nums1[mid1];
            r2=mid2==s2?Integer.MAX_VALUE:nums2[mid2];
            
            if(l1<=r2 && l2<=r1)
            {
                if((s1+s2)%2==0)
                {
                    return ((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
                }
                else
                {
                    return (Math.max(l1,l2));
                }
            }
            else if(l1>r2)
            {
                hi=mid1-1;
            }
            else
            {
                lo=mid1+1;
            }
            
        }
        return 0.0;
    }
}
        
