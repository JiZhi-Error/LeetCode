import java.util.HashSet;

class Solution {
    //    public int findRepeatNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.add(nums[i])) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i< nums.length; i++){
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }else{
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return -1;
    }
}
