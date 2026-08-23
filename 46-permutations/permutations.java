class Solution {

    public void findPermute(int[] arr, ArrayList<Integer> ds, boolean[] freq, List<List<Integer>> ansList){

        if(ds.size() == arr.length){
            ansList.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!freq[i]){
                freq[i] = true;

                ds.add(arr[i]);
                findPermute(arr, ds, freq, ansList);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ansList = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        findPermute(nums, ds, freq, ansList);

        return ansList;
        
    }
}