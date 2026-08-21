class Solution {
    public void operation(int[] arr, int ind, int target, ArrayList<Integer> list, ArrayList<List<Integer>> ans){

            if(target == 0){
                ans.add(new ArrayList<>(list));
                return;
            }
           

         for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i - 1])continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            operation(arr, i + 1, target - arr[i], list, ans);
            list.remove(list.size() - 1);
         }
        

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        

        operation(candidates, 0, target, new ArrayList<Integer>(), ans);
        return ans;
        
    }
}