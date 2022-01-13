class Solution {
    public int findLHS(int[] nums) {
        Map<Long,Integer> mp=new HashMap<>();
        for(long i:nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int result=0;
        for(long temp:mp.keySet())
        {
            if(mp.containsKey(temp+1))
            {
                result=Math.max(result,mp.get(temp)+mp.get(temp+1));
            }
        }
        
        return result;
    }
}
