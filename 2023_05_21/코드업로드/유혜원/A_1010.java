import java.io.*;
import java.util.StringTokenizer;

public class A_1010 {
    static int[][] arr = new int[31][31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(combi(M, N) + "\n");
        }
        System.out.println(sb);
    }

    private static int combi(int n, int r) // n : 원소 개수, r : 조합 개수
    {
        // 이미 계산된 값일 경우
        if (arr[n][r] > 0) {
            return arr[n][r];
        }

        // 원소의 개수가 조합의 개수와 동일하거나 0일 경우
        else if (n == r || r == 0) {
            return arr[n][r] = 1;
        }

        // 일반적인 경우
        else {
            return arr[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }
}