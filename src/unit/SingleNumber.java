package unit;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(findSingleNum(new int[]{1,1,3,10,10}));
    }
    //仅当出现两次时才管用 a^b^a=b
    public static int findSingleNum(int[] nums){
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i]^temp;
        }
        return temp;
    }
}
