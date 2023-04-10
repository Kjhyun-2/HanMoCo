import java.io.*;
import java.util.StringTokenizer;

public class A_1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = M;
        int cnt = 0;
        if (N != 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (max - num > -1) {
                    max -= num;
                } else {
                    max = M;
                    cnt++;
                    max -= num;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}