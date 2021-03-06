class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j,temp,flag;
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(i=0;i<nums2.length;i++)
        {
            list1.add(nums2[i]);
        }
        
        for(i=0;i<nums1.length;i++)
        {
            temp=nums1[i];
            flag=0;
            j=(list1.indexOf(temp))+1;
            while(j<nums2.length)
            {
                if(list1.get(j)>temp)
                {
                    list.add(list1.get(j));
                    flag=1;
                    break;
                }
                else
                {
                    j++;
                }
            }
            if(flag==0)
            {
                list.add(-1);
            }
        }
        int arr[]=new int[nums1.length];
        for(i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}

//Alternate Solution

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> mp=new HashMap<>();
        int ans[]=new int[nums1.length];
        int i;
        st.push(-1);
        for(i=nums2.length-1;i>=0;i--)
        {
            while(st.peek()<nums2[i] && st.peek()!=-1)
            {
                st.pop();
            }
            mp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        for(i=0;i<nums1.length;i++)
        {
            ans[i]=mp.get(nums1[i]);
        }
        return ans;
    }
}
