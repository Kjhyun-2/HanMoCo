import java.io.*;

public class A_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 10; // 자릿수를 구하려면 나누기 10해야댐
        int plus = 1; // 자리수 -> 1~9는 1, 10~99는 2 ~ -> 1,2,3
        int res = 0; // 총 자리수 -> plus 값을 계속 더함
        for (int i = 1; i <= N; i++) {
            if (i % num != 0) {
                res += plus;
            } else {
                plus++;
                res += plus;
                num *= 10;
            }
        }
        System.out.println(res);
    }
}