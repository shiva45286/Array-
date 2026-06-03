public class Binary {
    public static void main(String[] args) {
        int[] arr = {12, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;
        int target = 50;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                System.out.println("Index at: " + mid);
                return;
            } 
            else if (target < arr[mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

       
    }
}