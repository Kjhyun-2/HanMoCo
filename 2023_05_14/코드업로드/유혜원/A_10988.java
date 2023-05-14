import java.io.*;

public class A_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = new String(br.readLine());
        int num = string.length();
        int res = 1;

        for (int i = 0; i < (num / 2); i++) {
            if (string.charAt(i) != string.charAt(num - i - 1)) {
                res = 0;
            }
        }
        System.out.println(res);
    }
}