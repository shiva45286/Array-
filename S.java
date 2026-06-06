import java.util.Stack;
public class S{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        //peek
        Integer pEle =stack.peek();
        System.out.println(pEle);
        //pop
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());//size
        System.out.println(stack.isEmpty());//check empty stack
        }
}