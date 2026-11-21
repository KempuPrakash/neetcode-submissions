class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String sortedString=sortStr(strs[i]);
            if(!map.containsKey(sortedString))
            {
                map.put(sortedString,new ArrayList<>());
                map.get(sortedString).add(strs[i]);
            }
            else{
                map.get(sortedString).add(strs[i]);
            }
        }

        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet())
        {
            List<String> val=entry.getValue();
            res.add(val);
        }
        return res;
    }

    public String sortStr(String str)
    {
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
