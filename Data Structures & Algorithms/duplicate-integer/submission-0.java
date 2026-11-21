class Solution {
    public boolean hasDuplicate(int[] nums) {
        int initialSize=nums.length;
        boolean check=false;
        Set<Integer>setNums=Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toSet());
        if(initialSize!=setNums.size())
        {
            check=true;
        }
        return check;
    }
}