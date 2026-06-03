

public class Largest {
    public static void main(String[] args) {
        int[] nums = {12, 3, 44, 65, 23, 34};
        largest(nums);
    }

    static void largest(int[] arr) {
        int largestNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }

        System.out.println("Largest Number: " + largestNum);
    }
}
