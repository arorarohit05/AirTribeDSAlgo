import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // declared a stack of integers

        stack.push(20);
        stack.push(30);
        stack.push(60);

        System.out.println(stack.peek());

        System.out.println(stack.empty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
