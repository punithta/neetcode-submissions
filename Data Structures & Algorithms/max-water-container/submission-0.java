class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxmaxArea = 0;
        while(left <  right){
            int h = Math.min(heights[left],heights[right]);
            int w = right - left;
            int area = h * w;

            maxmaxArea = Math.max(area, maxmaxArea);
            if(heights[left] <= heights[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxmaxArea;
    }
}
