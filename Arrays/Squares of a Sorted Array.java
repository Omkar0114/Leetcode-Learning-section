class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int []squares = new int[nums.length];
        
        for(int i = 0; i< nums.length; i++) {
            int square = nums[i] * nums[i];
            squares[i] = square;
        }
        
        Arrays.sort(squares);
        return squares;
    }
}
