class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        
        int i = 0;
        int j = height.length-1;
        
        while(i < j){
            
            int x = Math.min(height[i] , height[j]) * (j-i);
            
            ans = Math.max(ans , x);
            
            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        
        return ans;
        
    }
}