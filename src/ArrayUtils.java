public class ArrayUtils {
    public static int getDifferenceBetweenLargestAndSmallest(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return max - min;
    }
    public static void printSmallestAndSecondSmallest(int[] array) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < first) {
                second = first;
                first = value;
            } else if (value < second && value != first) {
                second = value;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }
}
