class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int c=0;
        int ans=0;
        for(int j:set)
        {
            if(!set.contains(j-1))
            {
                int cur=j;
                c=0;
                while(set.contains(cur))
                {
                    c++;
                    cur++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
