class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l,r,mid;
        l=0;
        r=letters.length-1;
        char c=letters[0];
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(letters[mid]>target)
            {
                c=letters[mid];
                r=mid-1;
            }
            else
                l=mid+1;
        }
       return c;
    }
}
