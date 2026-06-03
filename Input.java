import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];


        for(int i =0; i<nums.length; i++){
        System.out.print("enter "+ (i+1) + " Element:");
    nums[i] =sc.nextInt();
    }
    for(int i=0; i<nums.length; i++){
        System.out.print(nums[i]+ " ");


}
    }
}