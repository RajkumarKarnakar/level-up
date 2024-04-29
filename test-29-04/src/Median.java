import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,2};
        System.out.println(findMedian(a));

    }

    public static double findMedian(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        if (length % 2 == 0) {
            return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
        }
        return (nums[length / 2]);
    }
}
