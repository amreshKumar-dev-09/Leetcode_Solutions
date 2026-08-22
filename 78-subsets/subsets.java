class Solution {

    public void findSubset(int[] arr, int ind, ArrayList<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i - 1])continue;

            ds.add(arr[i]);
            findSubset(arr, i + 1, ds, ansList);
            ds.remove(ds.size() - 1);

        }
    }



    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubset(nums, 0, new ArrayList<>(), ansList);
        return ansList;

        
    }
}