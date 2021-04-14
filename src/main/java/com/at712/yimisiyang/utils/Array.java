package com.at712.yimisiyang.utils;

import com.at712.yimisiyang.utils.tools.ListNode;

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

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null){
            int n1 = l1 == null? 0:l1.val;
            int n2 = l2 == null? 0:l2.val;
            int sum = n1 + n2 + carry;
            if(head == null){
                head = tail = new ListNode(sum % 10);
            }else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if(carry > 0){
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }


}
