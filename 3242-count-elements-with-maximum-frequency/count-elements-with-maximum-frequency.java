class Solution {
    public int maxFrequencyElements(int[] nums) {

        int total = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int maxFreq = 0;
        for(int value : map.values()){
            if(value > maxFreq){
                 maxFreq = value;
            }
        }

        for(int value : map.values()){
            if(value == maxFreq){
                total += value;
            }
        }
    

        return total;
        
    }
}