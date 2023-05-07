import java.io.*;

public class A_11729 {
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int other, int finish) throws IOException {
        // start: 출발지점, other: 다른 곳, finish: 목적지
        if (n == 1) {
            cnt++;
            sb.append(start + " " + finish + "\n");
            return;
        } else {
            cnt++;
            hanoi(n - 1, start, finish, other); // 맨 밑에꺼 빼고 n-1개의 탑을 목적지 외 다른곳으로 이동
            sb.append(start + " " + finish + "\n"); // 맨 밑 탑을 목적지로 이동
            hanoi(n - 1, other, start, finish); // 목적지 외 다른곳에 두었던 n-1개 탑을 목적지로 이동
        }
    }
}