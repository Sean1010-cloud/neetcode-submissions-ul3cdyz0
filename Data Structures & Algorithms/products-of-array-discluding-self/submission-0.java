class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int [] arr = new int [nums.length];

        for(int i = 0; i < n; i++){
            int curr = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    curr *= nums[j];
                }
            }
            arr[i] = curr;
        }
        return arr;
    }
}  
