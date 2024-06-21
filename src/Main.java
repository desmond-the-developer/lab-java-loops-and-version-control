public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9};


        int diff = ArrayUtils.getDifferenceBetweenLargestAndSmallest(array);
        System.out.println("Difference between largest and smallest: " + diff);


        ArrayUtils.printSmallestAndSecondSmallest(array);


        double x = 2.0;
        double y = 5.0;
        double result = MathUtils.calculateExpression(x, y);
        System.out.println("Result of the expression: " + result);
    }
}
