import java.io.*;

public class A_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        String[] string;
        for (int i = 0; i < N; i++) {
            string = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(string[0]); // 키
            arr[i][1] = Integer.parseInt(string[1]); // 몸무게
        }
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}