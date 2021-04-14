package com.at712.yimisiyang.utils;

public class Array {

    /**
     * 给出一个数组，一个目标值，返回数组相加为目标值的数组下标。
     *例如：输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        int length = nums.length;
        for(int i = 0; i < length; i++){
            for(int j = i+1; j < length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


}
