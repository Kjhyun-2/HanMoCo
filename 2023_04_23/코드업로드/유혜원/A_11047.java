import java.io.*;
import java.util.StringTokenizer;

public class A_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];             //동전의 가치 배열 
        int cnt = 0;                        //동전 개수
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());   //동전 가치 배열에 입력
        }
        for (int i = N - 1; i > -1; i--) {  //큰수부터 작은수로
            if (K >= arr[i]) {              //동전의 가치가 금액보다 작을 때
                cnt += K / arr[i];          //개수에 나눈 몫 플러스
                K %= arr[i];                //금액은 나눈 나머지로 값 바꿈 
                if (K == 0) {               //금액 0 되면 끝
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}