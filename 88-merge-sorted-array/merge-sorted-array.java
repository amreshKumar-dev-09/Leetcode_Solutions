class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        int low = 0;
        int high = 0; 

        while(low < m && high < n){
            if(nums1[low] < nums2[high]){
                arr.add(nums1[low]);
                low++;
            }
            else{
                arr.add(nums2[high]);
                high++;
            }
        }

            while(low < m){
                arr.add(nums1[low]);
                low++;
            }

            while(high < n){
                arr.add(nums2[high]);
                high++;
            }

            for(int i = 0; i < n+m; i++){
                nums1[i] = arr.get(i);
            }

            System.out.println(nums1);
    }
}