public class MergeSortedArrays {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int[] nums2) {
        int index1 = nums1.length - 1;
        int index2 = nums2.length - 1;
        int mergedIndex = (index1 + index2) - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }
}
