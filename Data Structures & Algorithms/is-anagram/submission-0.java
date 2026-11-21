class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int val=map.get(s.charAt(i));
                map.put(s.charAt(i),val+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                int val=map.get(t.charAt(i))-1;
                if(val>0)
                {
                    map.put(t.charAt(i),val);
                }
                else{
                    map.remove(t.charAt(i));
                }
            }
        }
        boolean check=false;
        if(map.size()==0)
        {
            check=true;
        }
        return check;
    }
}
