package unit;

import java.util.Arrays;

public class Solution {
    //方法二
    public static int removeDuplicates(int[] nums){
        int n = -1;
        int length = nums.length;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != n)
                n = nums[i];
            else {
                nums[i] = -1;
            }
        }
        int e;
        for (int i = 0; i < length; i++) {
            while(nums[i]==-1){
                for(int j=i;j<length-1;j++){
                    e = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = e;
                }
                length--;
            }
        }
        return length;
    }
    //方法一
    public static int removeDuplicates2(int[] nums){
        int length=0;
        int num=-1;
        for (int i = 0; i < nums.length; i++) {
            if(num!=nums[i]){
                num = nums[i];
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] list = new int[]{0,1,1,1,1,1,2,3,4,5,5,5,5,5};
        int num = removeDuplicates2(list);
        System.out.println("num="+num);
        System.out.println(Arrays.toString(list));
    }
}
