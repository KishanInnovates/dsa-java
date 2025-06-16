class AllocateBooks{
    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int m = 2;
        int res = findPages(arr, m);
        System.out.println("The minimum number of pages a student have: " + res);
    }
    //https://www.naukri.com/code360/problems/allocate-books_1090540?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries
    public static int findPages(int[] arr, int m){
        int low = max(arr);
        int high = sum(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfStudent = totalStudents(arr, mid);
            if (noOfStudent > m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            max = Math.max(n, max);
        }
        return max;
    }

    public static int sum(int[] arr) {
        int totalSum = 0;
        for (int n : arr) {
            totalSum += n;
        }
        return totalSum;
    }

    public static int totalStudents(int[] arr, int mid) {
        int student = 1, totalPages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (totalPages + arr[i] <= mid) {
                totalPages += arr[i];
            } else {
                student++;
                totalPages = arr[i];
            }
        }
        return student;
    }
}