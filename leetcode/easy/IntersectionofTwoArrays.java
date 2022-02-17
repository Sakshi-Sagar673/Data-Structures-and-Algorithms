class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList <>();
        if(nums1.length<nums2.length){
           for(int i =0; i<nums1.length;i++){
            int a=binarySearch(nums2,nums1[i]);
                if(a!=-1&&!ans.contains(a)){
                    ans.add(a);
                }
           }
        }
        else{  
            for(int i =0; i<nums2.length;i++){
            int a=binarySearch(nums1,nums2[i]);
                if(a!=-1&&!ans.contains(a)){
                    ans.add(a);
                }
           }
        }
        int z=ans.size();
        int[] anns = new int[z];
        for(int i =0;i<z;i++){
            anns[i] = ans.get(i);
        }
        return anns;
    }
     int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
           
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
            
                return arr[mid];
            }
        }
        return -1;
    }
}
