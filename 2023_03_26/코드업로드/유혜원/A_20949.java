import java.io.*;
import java.util.*;

public class A_20949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Float[] arr = new Float[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            float ppi = (float) (Math.sqrt(W * W + H * H)) / 77;
            arr[i] = ppi;
        }
        Float[] copyArr = arr.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] == copyArr[j]) {
                    System.out.println(j + 1);
                }
            }
        }
    }
}