class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int result[] = new int[Math.min(n,m)];

        while(i < n && j < m){

            if(nums1[i] < nums2[j]){
                i++;
            }

            else if(nums2[j] < nums1[i]){
                j++;
            }

            else{
                if(k == 0 || result[k - 1] != nums1[i]) {
                  result[k] = nums1[i];
                
                   k++;
                }
                i++;
                j++;

            }
        }

        return Arrays.copyOf(result, k);
        
    }
}