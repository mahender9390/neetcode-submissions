class Solution {
    public boolean isAnagram(String s, String t) {
       int arr[]=new int[26];
       int ca=0;
       if(s.length()!=t.length()) return false;
       for(char c:s.toCharArray())
       {
            int a=c-'a';
            ca++;
            arr[a]++;
       }
       for(char c:t.toCharArray())
       {
            
            int a=c-'a';
            if(arr[a]==0 || c==0) return false;
            arr[a]--;
            c--;
       }
       return true;
    }
}
