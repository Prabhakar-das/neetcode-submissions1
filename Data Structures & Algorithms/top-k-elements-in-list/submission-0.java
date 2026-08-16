class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{map.put(nums[i],1);}
       }
       List<Integer> topKeys = map.entrySet().stream()
    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
    .limit(k)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());
    Collections.sort(topKeys);

      int[] array = topKeys.stream().mapToInt(Integer::intValue).toArray();
      return array;
    }
}
