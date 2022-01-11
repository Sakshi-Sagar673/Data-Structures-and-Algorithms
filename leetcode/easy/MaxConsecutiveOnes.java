class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i,c=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                list.add(c);
                c=0;
            }
        }
        if(i==nums.length)
        {
            list.add(c);
        }
    
        return Collections.max(list);
    }
}
