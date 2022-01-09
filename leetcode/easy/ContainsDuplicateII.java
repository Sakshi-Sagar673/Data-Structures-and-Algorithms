import java.util.*;
import java.lang.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> numbers=new HashMap<>();
        if(nums.length==1)
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(numbers.containsKey(nums[i]))
            {
                if(Math.abs(numbers.get(nums[i])-i)<=k)
                {
                    return true;
                }
                else
                {
                    numbers.put(nums[i],i);
                }
            }
            else
            {
                numbers.put(nums[i],i);
            }
        }
        return false;
    }
}
