import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 끊어진 기타 줄 개수
        int M = Integer.parseInt(st.nextToken()); // 기타줄 브랜드 개수
        int[] p = new int[M];
        int[] n = new int[M];
        for (int i = 0; i < M; i++) { // 브랜드마다
            st = new StringTokenizer(br.readLine());
            p[i] = Integer.parseInt(st.nextToken()); // 패키지 가격
            n[i] = Integer.parseInt(st.nextToken()); // 낱개 가격
        }
        Arrays.sort(p);
        Arrays.sort(n);

        int res = 0;
        int money = 0;

        if (n[0] * 6 > p[0]) { // 패키지가 더 저렴한 경우
            money = N / 6 * p[0]; // 최대한 패키지로 산다
            res = N % 6; // 패키지로 사고 남은 나머지
            if (p[0] >= n[0] * res) { // 나머지*낱개가 작을경우
                money += n[0] * res;
            } else { // 패키지가 작을 경우
                money += p[0];
            }
        } else { // 낱개로 샀을 때 더 저렴한 경우
            money = n[0] * N;
        }

        System.out.println(money);
    }
}