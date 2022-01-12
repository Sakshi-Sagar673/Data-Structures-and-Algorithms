class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> temp=new ArrayList<>();
        Map<Integer,String> mp=new HashMap<>();
        Map<Integer,Integer> mp1=new HashMap<>();
        int m,x;
        for(int i=0;i<score.length;i++)
        {
            temp.add(score[i]);
        }
        for(int i=0;i<score.length;i++)
        {
            m=Collections.max(temp);
            if(i==0)
            {
                mp.put(m,"Gold Medal");
            }
            else if(i==1)
            {
                mp.put(m,"Silver Medal");
            }
            else if(i==2)
            {
                mp.put(m,"Bronze Medal");
            }
            else
            {
                x=i+1;
                mp1.put(m,x);
            }
            temp.remove(Integer.valueOf(m));
        }
        String res[]=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            if(mp.containsKey(score[i]))
            {
                res[i]=mp.get(score[i]);
            }
            else if(mp1.containsKey(score[i]))
            {
                res[i]=Integer.toString(mp1.get(score[i]));
            }
        }
        return res;
    }
}
