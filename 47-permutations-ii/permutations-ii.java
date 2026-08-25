class Solution {
    public void permute(int[] arr, int ind, List<List<Integer>> ans) {

        if(ind == arr.length) {
            ArrayList<Integer> ds = new ArrayList<>();

            for(int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i < arr.length; i++) {

            boolean duplicate = false;

            for(int j = ind; j < i; j++) {
                if(arr[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }

            if(duplicate)
                continue;

            swap(i, ind, arr);
            permute(arr, ind + 1, ans);
            swap(i, ind, arr);
        }
    }

    public void swap(int i, int j, int arr[]) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        permute(nums, 0, ans);

        return ans;
    }
}