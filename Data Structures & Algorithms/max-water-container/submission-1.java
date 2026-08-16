class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int res=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                res=Math.max(res,Math.min(heights[i], heights[j])*(j-i));
            }
        }
        return res;
    }
}
