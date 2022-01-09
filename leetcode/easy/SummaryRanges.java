import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new LinkedList<>();
        int temp,i;
        for(i=0;i<nums.length;i++)
        {
            temp=nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1)
            {
                i++;
            }
            if(temp!=nums[i])
            {
                list.add(temp+"->"+nums[i]);
            }
            else
            {
                list.add(temp+"");
            }
        }
        return list;
    }
}
