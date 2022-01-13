class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> mp=new HashMap<>();
        List<String> temp=new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        {
            mp.put(list1[i],i);
        }
        int mi=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++)
        {
            Integer j=mp.get(list2[i]);
            if(j!=null && i+j<=mi)
            {
                if(i+j<mi)
                {
                     temp.clear();
                     mi=i+j;
                }
                 temp.add(list2[i]);
            }
           
        }
        return temp.toArray(new String[temp.size()]);
    }
}
