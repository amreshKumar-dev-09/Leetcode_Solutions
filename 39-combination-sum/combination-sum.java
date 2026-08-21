class Solution {

    public void findCombinations(int[] arr, int target, int ind, ArrayList<Integer>list, ArrayList<List<Integer>>ans){
        if(ind >= arr.length){
            if(target  == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[ind] <= target){
            list.add(arr[ind]);
            findCombinations(arr, target - arr[ind], ind, list, ans);
            list.remove(list.size() - 1);
        }

        findCombinations(arr, target, ind+1, list, ans);

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    findCombinations(candidates, target, 0, new ArrayList<Integer>(), ans);

    return ans;
        
    }
}