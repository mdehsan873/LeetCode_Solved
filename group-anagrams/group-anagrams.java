class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        List<List<String>>ans=new LinkedList<>();
        for(String str:strs)
        {
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
           if(hm.containsKey(String.valueOf(arr)))
           {
               hm.get(String.valueOf(arr)).add(str);
           }else
           {
               hm.put(String.valueOf(arr),new LinkedList<>());
               hm.get(String.valueOf(arr)).add(str);
           }
            
            
        }
        for(String key:hm.keySet())
        {
            ans.add(hm.get(key));
        }
        return ans;
    }
}