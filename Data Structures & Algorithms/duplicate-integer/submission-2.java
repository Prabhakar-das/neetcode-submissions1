class Solution {
    public boolean hasDuplicate(int[] nums) {
        //return Arrays.stream(nums).distinct().count() < nums.length;
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){

            if(!seen.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}