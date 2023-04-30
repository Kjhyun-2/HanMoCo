import java.io.*;

public class A_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
