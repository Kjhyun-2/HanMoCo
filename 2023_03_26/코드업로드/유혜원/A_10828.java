import java.io.*;
import java.util.*;

public class A_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String string = st.nextToken();
            if (string.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (string.equals("pop")) {
                if (stack.empty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            } else if (string.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (string.equals("empty")) {
                if (stack.empty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (string.equals("top")) {
                if (stack.empty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.println(sb);

    }
}