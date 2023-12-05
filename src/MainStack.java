import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(5);
        integerStack.push(1);
        integerStack.push(9);
        //9
        //1
        //5

        Integer value = integerStack.pop();
        Integer peekedValue = integerStack.peek();

        System.out.println(value);
        System.out.println(peekedValue);

        value = integerStack.pop();

        System.out.println(value);

    }
}
