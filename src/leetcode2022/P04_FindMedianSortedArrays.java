package leetcode2022;

import common.Tools;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.



Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -10^6 <= nums1[i], nums2[i] <= 10^6


 */
public class P04_FindMedianSortedArrays {

    public static void main(String args[]) {
        P04_FindMedianSortedArrays test = new P04_FindMedianSortedArrays();
        Tools.println(test.findMedianSortedArrays(new int[]{1}, new int[]{3}));
        Tools.println(test.findMedianSortedArrays(new int[]{1}, new int[]{}));
        Tools.println(test.findMedianSortedArrays(new int[]{}, new int[]{3}));
        Tools.println(test.findMedianSortedArrays(new int[]{1, 2}, new int[]{3}));
        Tools.println(test.findMedianSortedArrays(new int[]{1}, new int[]{0, 3}));
        Tools.println(test.findMedianSortedArrays(new int[]{1, 2, 7, 9}, new int[]{3, 4, 8}));
        Tools.println(test.findMedianSortedArrays(new int[]{1, 10, 10}, new int[]{0, 3, 7, 9, 10}));
        Tools.println(test.findMedianSortedArrays(new int[]{5, 5, 5}, new int[]{4, 4, 4}));
        Tools.println(test.findMedianSortedArrays(new int[]{5, 5, 5, 5}, new int[]{4, 4, 4}));
        Tools.println(test.findMedianSortedArrays(new int[]{5, 5}, new int[]{4, 4, 4}));
        Tools.println(test.findMedianSortedArrays(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final boolean isOdd = (nums1.length + nums2.length) % 2 == 1;
        int m = 0, n = 0;
        if (isOdd) {
            int p = 0;
            int k = 0;
            int mid = (nums1.length + nums2.length) / 2 + 1;
            while (k < mid) {
                while (m < nums1.length && k < mid && (n >= nums2.length || nums1[m] < nums2[n])) {
                    p = nums1[m];
                    m++;
                    k++;
                }
                while (n < nums2.length && k < mid && (m >= nums1.length || nums2[n] < nums1[m])) {
                    p = nums2[n];
                    n++;
                    k++;
                }
            }
            return p;
        } else {
            int mid = (nums1.length + nums2.length) / 2 - 1;
            while (m + n < mid) {

                while (m < nums1.length && m + n < mid && (n >= nums2.length || nums1[m] < nums2[n])) {
                    m++;
                }
                while (n < nums1.length && m + n < mid && (m >= nums1.length || nums2[n] < nums1[m])) {
                    n++;
                }
            }
            if (m < nums1.length && n < nums2.length) {
                return (nums1[m] + nums2[n]) / 2d;
            } else if (m < nums1.length) {
                return (nums1[m - 1] + nums1[m]) / 2d;
            } else if (n < nums2.length) {
                return (nums2[n - 1] + nums2[n]) / 2d;
            }
        }
        return 0;
    }
}
