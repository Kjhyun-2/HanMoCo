import java.io.*;

public class A_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if ((n % 2) != 0) {
                sum += n;
                if (n < min) {
                    min = n;
                }
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.print(sum + "\n" + min);
        }
    }
}