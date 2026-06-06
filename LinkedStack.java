import java.util.LinkedList;

public class LinkedStack {
    public static void main(String[] args){
        LinkedList<Integer>li = new LinkedList<>();
        //pop
        li.addLast(10);
        li.addLast(20);
        li.addLast(20);
        System.out.println(li);
        //peek
        System.out.println(li.peek());
        li.removeLast();
        System.out.println(li);
    }

}
