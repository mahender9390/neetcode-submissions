class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[k];
        int c=0;
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Collections.max(map.values());
        while(c<k)
        {
            for(Map.Entry<Integer,Integer> e:map.entrySet())
            {
                if(e.getValue().equals(max))
                {
                    ans[c++]=e.getKey();
                }
            }
            max--;

        }
        return ans;
    }
}
