class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> temp=new HashSet<>();
        int i;
        for(i=0;i<nums1.length;i++)
        {
            if(!temp.contains(nums1[i]))
            {
                temp.add(nums1[i]);
            }
        }
        for(i=0;i<nums2.length;i++)
        {
            if(temp.contains(nums2[i]))
            {
                ans.add(nums2[i]);
                temp.remove(nums2[i]);
            }
        }
        int arr[]=new int[ans.size()];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
