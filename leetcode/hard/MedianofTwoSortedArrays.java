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
