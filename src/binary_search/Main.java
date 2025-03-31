package binary_search;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 0, 3, 5, 9, 12};
        int target=9;
        System.out.println(search(array, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
