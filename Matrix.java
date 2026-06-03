public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {30, 40, 50},
            {60, 70, 80}
        };

        System.out.println("Element at [1][0]: " + matrix[1][0]);

        System.out.println("\nMatrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}
    

