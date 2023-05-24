import java.io.*;
import java.util.StringTokenizer;

public class A_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 현재 랭킹 점수 개수
        int newscore = Integer.parseInt(st.nextToken()); // 넣을 새 점수
        int P = Integer.parseInt(st.nextToken()); // 랭킹 최대 개수

        if (N == 0) {
            System.out.println("1");
            return;
        }

        int[] arr = new int[P]; // 점수 배열

        st = new StringTokenizer(br.readLine()); // 점수 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int rank = 1;
        if (N == P && arr[N - 1] >= newscore) { // 랭킹 꽉차고 젤 작은 값과 새점수 같으면
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] > newscore) {
                rank++;
            } else {
                rank = i + 1;
                break;
            }
        }

        if (rank <= P) {
            System.out.println(rank);
        } else {
            System.out.println("-1");
        }
    }
}