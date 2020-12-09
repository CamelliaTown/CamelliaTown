package unit;

import java.util.Arrays;

/**
 * 判断数组中是否有重复元素
 * 采取归并排序的方法先将数组进行排序再检查是否有重复
 */
public class IsDuplict {

    public static void main(String[] args) {
        int[] nums = new int[]{};
        System.out.println(isDuplict(nums));
    }

    public static boolean isDuplict(int[] nums){
        if(nums==null||nums.length<2)
            return false;
        int[] list = divideSort(0,nums.length-1,nums);
        System.out.println(Arrays.toString(list));
        for(int i=1;i<list.length;i++){
            if(list[i]==list[i-1])
                return true;
        }
        return false;
    }

    public static int[] divideSort(int left,int right,int[] nums){
        if(left==right)
            return new int[]{nums[left]};
        int mid = (left+right)/2;
        int[] leftList = divideSort(left,mid,nums);
        int[] rightList = divideSort(mid+1,right,nums);

        int length = leftList.length+rightList.length;
        int[] list = new int[leftList.length+rightList.length];
        int m=0,n=0;
        for (int i = 0; i < length; i++) {
            if(m<leftList.length&&n<rightList.length){
                if(leftList[m]<=rightList[n]){
                    list[i] = leftList[m];
                    m++;
                }else{
                    list[i] = rightList[n];
                    n++;
                }
            }else{
                if(m<leftList.length){
                    list[i] = leftList[m];
                    m++;
                }else if(n<rightList.length){
                    list[i] = rightList[n];
                    n++;
                }
            }
        }
        return list;
    }
}
