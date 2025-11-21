package org.example;

public class SearchSortedArray {



    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid  = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
           /* if(nums[left] == target) {
                return left;
            }
            if(nums[right] == target) {
                return right;
            }*/
        }

        return -1; // Target not found
    }


    static void main() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}
