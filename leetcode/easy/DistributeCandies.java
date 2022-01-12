class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int c=1,temp,res;
        for(int i=1;i<candyType.length;i++)
        {
            if(candyType[i]!=candyType[i-1])
            {
                c++;
            }
        }
        
        temp=candyType.length/2;
        if(temp<c)
        {
            res=temp;
        }
        else
        {
            res=c;
        }
        return res;
        
    }
}
