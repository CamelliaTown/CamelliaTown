package unit;

import java.util.Arrays;

/**
 * 将数组中所有的零后移
 */
public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(new int[]{0,2,3,0,0,0,0,1,5,0})));
    }

    public int[] moveZeroes(int[] nums){
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0)
                nums[i-times]=nums[i];
            else times++;
        }
        for(int i=nums.length-times;i<nums.length;i++){
            nums[i] = 0;
        }
        return nums;
    }
}
