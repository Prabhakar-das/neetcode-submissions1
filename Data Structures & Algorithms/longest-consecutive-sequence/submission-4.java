class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            int count = 0;
            if(nums[i+1]-nums[i]==1){
                count++;
                
            }
            else{count=0;}
            max=max+count;
            max=Math.max(max, count);
        }
        return max+1;
    }
}
