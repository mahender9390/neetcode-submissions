class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans=0;
        int dif=0;
        while(i<j)
        {
            int s=Math.min(heights[i],heights[j]);
            ans=Math.max(ans,(s*(j-i)));
            if(heights[i]==s)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
    return ans;
    }
}
