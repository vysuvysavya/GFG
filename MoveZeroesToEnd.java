--1
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i = 0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}


nums =
[0,1,0,3,12]
Output
[1,3,12,0,0]
