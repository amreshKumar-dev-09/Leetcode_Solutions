class Solution {

    public void merge(ArrayList<Integer> arr, int low, int high, int mid){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr.get(left) < arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
             temp.add(arr.get(right));
             right++;

            }
        }

        while(left <= mid){
            temp.add(arr.get(left));
            left++;
        }

         while(right <= high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i = low; i <= high; i++){
            arr.set(i, temp.get(i - low));
        }
    }

    public void mergeSort(ArrayList<Integer> arr, int low, int high){
        if(low == high)return;

        int mid = (low + high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);

    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr= new ArrayList<>();

        for (int num : nums) {
            arr.add(num);
        }

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            nums[i] = arr.get(i);
        }

        return nums;
    }
}