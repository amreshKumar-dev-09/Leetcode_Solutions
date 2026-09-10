class Solution {
    public int thirdMax(int[] nums) {

        long largest = nums[0];
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            }

            else if(nums[i] < largest && nums[i] > secondLargest){
                thirdLargest =  secondLargest;
                secondLargest = nums[i];
            }

            else if(nums[i] < largest && nums[i] < secondLargest && nums[i] > thirdLargest){
                thirdLargest = nums[i];
            }
        }

        if(thirdLargest != Long.MIN_VALUE) {
            return (int) thirdLargest;
        }

        return (int) largest;
    }
}