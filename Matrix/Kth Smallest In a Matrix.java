package Matrix;

public class Kth
Smallest In
a Matrix
{

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[i * n + j] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
