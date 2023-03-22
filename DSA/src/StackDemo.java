import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack
        Stack st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Stack size
        System.out.println(st.size());

        // Top element
        System.out.println(st.peek());

        // Print Stack
        System.out.println(st);

        // Pop
        st.pop();
        st.pop();
        st.pop();

        System.out.println(st);
    }
}