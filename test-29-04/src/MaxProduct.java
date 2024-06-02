import java.time.LocalTime;
import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = new int[]{10, 20, 30, -50, -15, 1, 2};
        // System.out.format("Max product is: %d", maxProduct.maxProductOfTwoNumbers(numbers));
       // System.out.println(Arrays.toString(numbers));
        System.out.format("Max product is: %d\n", maxProduct.maxProductOfTwoNumbersUsingSort(numbers));
       // System.out.println(Arrays.toString(numbers));
        System.out.format("Max product in O(n) is: %d\n", maxProduct.maxProductOfTwoNumbersInOOfN(numbers));

    }

    int maxProductOfTwoNumbers(int[] numbers) {
        // Your code goes here.
        int length = numbers.length;
        int max = Integer.MIN_VALUE;
        if (length < 2) {
            return max;
        }
        System.out.println("start loop \n" + LocalTime.now());
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                max = (Math.max(numbers[i] * numbers[j], max));
            }
        }
        System.out.println(LocalTime.now() + "\nend loop");
        return max;
    }

    int maxProductOfTwoNumbersUsingSort(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int length = numbers.length;
        int[] duplicate = Arrays.copyOf(numbers, length);

        Arrays.sort(duplicate);
        max = Math.max(duplicate[length - 1] * duplicate[length - 2], duplicate[0] * duplicate[1]);

        return max;
    }

    int maxProductOfTwoNumbersInOOfN(int[] numbers) {
        int length = numbers.length;
        int max1 = numbers[0];
        int max2 = Integer.MIN_VALUE;
        int min1 = numbers[0];
        int min2 = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number>max2) {
                max2 =number;
            }
            if(number<min1){
                min2=min1;
                min1=number;
            }else if (number<min2){
                min2=number;
            }
        }
        System.out.format("min1 %d min2 %d max1 %d max2 %d",min1,min2,max1,max2);
        return Math.max(min1*min2,max1*max2);
    }
}
