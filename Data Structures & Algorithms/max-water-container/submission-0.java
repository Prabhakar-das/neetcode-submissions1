class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        Arrays.sort(heights);
        int[] uniqueNumbers = Arrays.stream(heights).distinct().toArray();
        System.out.println(Arrays.toString(uniqueNumbers));
        return uniqueNumbers[n-3]*uniqueNumbers[n-3];
    }
}
