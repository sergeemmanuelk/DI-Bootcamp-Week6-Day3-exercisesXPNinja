public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
        }
    }
}