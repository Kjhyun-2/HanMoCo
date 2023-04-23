import java.io.*;

public class A_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cnt = 0; // 막대 개수
        int stick = 64; // 막대 길이
        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                cnt++;
                X -= stick;
            }
        }
        System.out.println(cnt);
    }
}