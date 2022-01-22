public class Solution {
    public int sqrt(int A) {
        long s,e,temp,m,i;
        s=0;
        e=A/2;
        i=A;
        if(A==0 || A==1)
        {
            return A;
        }
        while(s<e)
        {
            m=(s+e)/2;
            if(m*m==A)
            {
                return (int)m;
            }
            else if(m*m<A)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
       return (int) (s*s <= i? s: s-1);
    }
}
