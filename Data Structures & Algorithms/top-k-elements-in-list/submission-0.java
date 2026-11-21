class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int top[]=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        Map<Integer,Integer>sortedMap=
            map.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .limit(k)
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue
                ));
        int i=0;
        for(Integer key:sortedMap.keySet())
        {
            top[i]=key;
            i++;
        }
        return top;
    }
}
