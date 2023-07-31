public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, -3, 2, 1, -1};
        int[] secondArray = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] thirdArray = {10, -1, -2, 5, 3, -6, 7};
        int[] fourthArray = {3, 2, -1, 5, 6, 7};

        System.out.println(greatestSubArraySum(firstArray));
        System.out.println(greatestSubArraySum(secondArray));
        System.out.println(greatestSubArraySum(thirdArray));
        System.out.println(greatestSubArraySum(fourthArray));

    }

    public static int greatestSubArraySum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxSum = array[0];
        int currentSum = array[0];

        for (int actual : array) {
            if (actual < currentSum + actual) {
                currentSum += actual;
            } else {
                currentSum = actual;
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static int maxSubarraySum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            int actualSum = 0;
            for (int j = i; j < array.length; j++) {
                actualSum += array[j];
                if (actualSum > max) {
                    max = actualSum;
                }
            }
        }
        return max;
    }
}