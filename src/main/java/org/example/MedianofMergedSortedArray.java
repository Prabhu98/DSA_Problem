package org.example;

import java.util.Arrays;

public class MedianofMergedSortedArray {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total = nums1.length + nums2.length;
        int mid = total / 2;

        int[] mergedArr = mergedArray(nums1, nums2, mid);

        if (total % 2 != 0) // total is odd
            return (double) mergedArr[mid];
        else  // total is even
            return ((double) mergedArr[mid] + mergedArr[mid - 1]) / 2;
    }

        public int[] mergedArray(int[] nums1,int[] nums2,int mid){

        int[] mergedArray = new int[mid+1];

        int ptr1 =0;
        int ptr2 =0;
        int ptr3 =0;

        if(nums1.length == 0) return nums2;
        if(nums2.length == 0) return nums1;

        while(ptr1 < nums1.length && ptr2 < nums2.length && ptr3 <= mid){
            if(nums1[ptr1] < nums2[ptr2]){
                mergedArray[ptr3++] = nums1[ptr1++];
            }else{
                mergedArray[ptr3++] = nums2[ptr2++];
            }
        }

        while(ptr2 < nums2.length && ptr3 <= mid){
            mergedArray[ptr3++] = nums2[ptr2++];
        }

        while(ptr1 < nums1.length && ptr3 <= mid){
            mergedArray[ptr3++] = nums1[ptr1++];
        }

        System.out.println("Merged Array is :" + Arrays.toString(mergedArray));
        return mergedArray;
    }


    static void main() {
        MedianofMergedSortedArray obj = new MedianofMergedSortedArray();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double median = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
