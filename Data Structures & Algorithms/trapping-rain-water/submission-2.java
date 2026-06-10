class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int left=0;
        int right=0;
        int ans=0;
        while(i<j)
        {
            if(height[i]<=height[j])
            {
                if(left>height[i])
                {
                    ans=ans+Math.abs(left-height[i]);
                }
                else{
                    left=height[i];
                }
                i++;
            }
            else{
                if(right>height[j])
                {
                    ans+=Math.abs(right-height[j]);
                }
                else{
                    right=height[j];
                }
                j--;
            }
        }
        return ans;
    }
}
