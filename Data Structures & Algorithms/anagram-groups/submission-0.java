class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> arr=new ArrayList<>();
        int n=strs.length;
        boolean check[]=new boolean[n];
        boolean ans;
        for(int i=0;i<n;i++)
        {
            if(check[i]!=true){
                int j=n-1;
                List<String> a=new ArrayList<>();
                a.add(strs[i]);
                check[i]=true;
                while(j>i)
                {
                    if(strs[i].length()!=strs[j].length() || check[j]==true)
                    {
                        j--;
                    }
                    else{
                        ans=anagram(strs[i],strs[j]);
                        if(ans)
                        {
                            a.add(strs[j]);
                            check[j]=true;
                            j--;
                        }
                        else{
                            j--;
                        }
                    }
                }
                arr.add(a);
            }
        }
        return arr;
    }
    static boolean anagram(String s1,String s2)
    {
        int arr[]=new int[26];
        for(char ch:s1.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(char c:s2.toCharArray())
        {
            if(arr[c-'a']==0) return false;
            arr[c-'a']--;
        }
        return true;
    }
}
