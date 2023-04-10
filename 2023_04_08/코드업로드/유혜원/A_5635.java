import java.io.*;
import java.util.*;

public class A_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = st.nextToken();
            }
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                if (o1[3].equals(o2[3])) {
                    if (o1[2].equals(o2[2])) {
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]); // 음수가 나오면 위치를 바꾸지 않는다는 뜻
                                                                                  // 양수가 나오면 위치를 바꿈
                    } else {
                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                    }
                } else {
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }
            }
        });
        System.out.println(arr[N - 1][0]);
        System.out.println(arr[0][0]);
    }
}