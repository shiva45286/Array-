//hashmap
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Shivani", 95);
        marks.put("Rahul", 88);
        marks.put("Priya", 92);

        for(String key : marks.keySet()){
            System.out.println(key + " " + marks.get(key));

        }
         }
    }




        // System.out.println(marks.get("Shivani"));
        //  System.out.println(marks.containsKey("Shivani"));
        //   System.out.println(marks.containsValue(95));


        //for each
        // int[] arr ={10, 20, 30};
        // for(int nums: arr){
        //     System.out.println(nums);


       