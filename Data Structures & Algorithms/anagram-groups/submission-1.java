class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs)
        {
            int a[]=new int[26];
            for(char ch:s.toCharArray()){
                a[ch-'a']++;
            }
            String key=Arrays.toString(a);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
