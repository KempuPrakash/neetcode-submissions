class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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

        List<Integer> bucket[]=new List[nums.length+1];
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            Integer num=entry.getKey();
            Integer freq=entry.getValue();

            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int res[]=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
               for(int num:bucket[i])
               {
                    res[index++]=num;
                    if(index==k)
                    {
                        return res;
                    }
               }

            }
        }
        return res;
    }
}
