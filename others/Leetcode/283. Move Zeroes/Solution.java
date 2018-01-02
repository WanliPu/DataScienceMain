public class Solution {
    public void moveZeroes(int[] nums) {
        if( nums == null || nums.length == 0 ) return;
        int index = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] != 0) nums[index++] = nums[i];
        }
        while (index < nums.length) nums[index++] = 0;
    }
}

public class Solution {
    public void moveZeroes(int[] nums) {
        if( nums == null || nums.length == 0 ) return;
        int index = 0;
        for( int i = 0 ; i < nums.length ; i++){
            if( nums[i] != 0 ){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}