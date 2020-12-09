package unit;
//将数组进行旋转

import java.util.Arrays;

/**
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 */
public class Rotate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    //方法一：暴力算法通过一位一位移动实现
    //时间复杂度为O(n*k)
    public static void TestRotate(int[] nums,int k) {
        if (nums == null || nums.length <= 1)
            return;
        k = k % nums.length;
        if (k < nums.length / 2) {
            for (int i = 0; i < k; i++) {
                int p;
                int n;

            }
        }
    }
    //通过将数组进行倒转实现
    //时间复杂度为O(n)
    public static void rotate(int[] nums, int k) {
        if(nums==null||nums.length<=1){
            return ;
        }
        rote(nums,0,nums.length-1);
        rote(nums,0,k-1);
        rote(nums,k,nums.length-1);
    }

    public static void rote(int[] nums,int l,int r){
        int temp;
        for(int i=0;i<(r-l+1)/2;i++){
            temp = nums[l+i];
            nums[l+i] = nums[r-i];
            nums[r-i] = temp;
        }
    }

//        if(k>nums.length/2){
//            for (int i = 0; i < k; i++) {
//                for (int j = 0; j < nums.length; j++) {
//                    nums[j] = n;
//                    n = nums[(j-1)%nums.length];
//                    nums[(j-1)%nums.length] = nums[j];
//                }
//            }
//        }
}

