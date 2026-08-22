class Solution {

    public void findSubsets(int[] arr, int ind, ArrayList<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i - 1])continue;

            ds.add(arr[i]);
            findSubsets(arr,i + 1, ds, ansList);
            ds.remove(ds.size() - 1);

        }
    }




    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), ansList);
        return ansList;

        
    }
}