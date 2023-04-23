import java.io.*;
import java.util.StringTokenizer;

public class A_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x; // 거리 = y-x
            int max = (int) Math.sqrt(distance); // "루트 거리"에서 소수점을 뺀값(int 형변환)이 최대경우
            if (max == Math.sqrt(distance)) {
                sb.append(max * 2 - 1).append("\n"); // 밑에 표 보면 알 수 있움
            } else if (max * max < distance && distance <= max * max + max) {
                sb.append(max * 2).append("\n");
            } else {
                sb.append(max * 2 + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}

// 이동경우             거리    횟수   최대경우
// 1                    1       1       1
// 1 1                  2       2       1
// 1 1 1                3       3       1
// 1 2 1                4       3       2/
// 1 2 1 1              5       4       2
// 1 2 2 1              6       4       2
// 1 2 2 1 1            7       5       2
// 1 2 2 2 1            8       5       2
// 1 2 3 2 1            9       5       3/
// 1 2 3 2 1 1          10      6       3
// 1 2 3 2 2 1          11      6       3
// 1 2 3 3 2 1          12      6       3
// 1 2 3 3 2 1 1        13      7       3
// 1 2 3 3 2 2 1        14      7       3
// 1 2 3 3 3 2 1        15      7       3
// 1 2 3 4 3 2 1        16      7       4/
// 1 2 3 4 3 2 1 1      17      8       4
// ...
// 1 2 3 4 5 4 3 2 1    25      9       5/

// -> 최대경우 바뀔때 제곱 = 거리
// -> 횟수 최대 = 최대경우 * 2 - 1
// -> 위 경우 빼면 최대경우만큼 횟수 반복되고 넘어감

// 횟수 최소값
// 거리 = y-x