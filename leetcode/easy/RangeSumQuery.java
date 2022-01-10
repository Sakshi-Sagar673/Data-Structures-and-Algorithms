class NumArray {
    private int[] temp;

    public NumArray(int[] nums) {
        temp=new int[nums.length+1];
        temp[0]=0;
        for(int i=1;i<temp.length;i++)
        {
            temp[i]=temp[i-1]+nums[i-1];
        }
          
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        {
            return temp[right+1];
        }
        else
        {
            return temp[right+1]-temp[left];
        }
        
        
    }
}
