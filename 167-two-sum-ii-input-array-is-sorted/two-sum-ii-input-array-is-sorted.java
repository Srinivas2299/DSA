class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int current_sum;
        while (left<right)
        {
            current_sum=numbers[left]+numbers[right];
            if(current_sum==target)
                return new int[]{left+1,right+1};
            else if(current_sum<target)
                left++;
            else
                right--;
        }
        return new int[0];
    }
}