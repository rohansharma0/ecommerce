class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        
        for(int i = 0; i< nums1.length ; i++){
            int k = -1;
            boolean found = false;
            for(int j = 0 ; j< nums2.length ; j++){
                
                if(nums2[j] == nums1[i]){
                    found = true;
                }
                
                if(found && nums2[j] > nums1[i]){
                    k = nums2[j];
                    break;
                }
                
            }
            
            ans[i] = k;
        }
        
        return ans;
        
    }
}