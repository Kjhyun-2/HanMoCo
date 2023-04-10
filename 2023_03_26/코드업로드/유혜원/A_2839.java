import java.io.*;

public class A_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;

        while (true) {
            if ((N % 5) == 0) {
                num += (N / 5);
                System.out.println(num);
                break;
            } else {
                N -= 3;
                num++;
                if (N < 0) {
                    System.out.println("-1");
                    break;
                }
            }
        }
    }
}