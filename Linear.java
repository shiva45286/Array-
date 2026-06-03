public class Linear {
    public static void main(String[] args) {

        // Linear Search
        int[] nums = {10, 23, 54, 64, 12};

        int target = 12;

        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}