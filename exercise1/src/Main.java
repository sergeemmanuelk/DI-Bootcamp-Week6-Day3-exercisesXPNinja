public class Main {
    public static void main(String[] args) {

        int[] array1 = {2, 8, 7, 5};
        int[] array2 = {12, 90, 75};
        int[] array3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};

        System.out.println(warOfNumbers(array1)); // 2
        System.out.println(warOfNumbers(array2)); // 27
        System.out.println(warOfNumbers(array3)); // 168
    }

    public static int warOfNumbers(int[] array) {
        int evenSum = 0;
        int oddSum = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        return Math.abs(evenSum - oddSum);
    }
}