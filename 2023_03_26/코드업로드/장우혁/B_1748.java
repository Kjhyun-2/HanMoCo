import java.io.*;

public class B_1748 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());
        int key = 10, plus = 1, sum = 0; // k = 10, 100, 1000, 10000... //plus는 sum에 더해줄 값(자리수)
        for (int i = 1; i < num + 1; i++) {
            if (i % key == 0 || i / key == 1) { // i를 key로 나눈 나머지가 0이면서 몫이 1일때.
                key *= 10;
                plus++;
            }
            sum += plus;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
