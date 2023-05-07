import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> mycard = new HashSet<Integer>();
        ArrayList<Integer> newcard = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            mycard.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            newcard.add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < M; i++) {
            // int card = Integer.parseInt(st.nextToken());
            if (mycard.contains(newcard.get(i)) == true) {
                sb.append("1" + " ");
            } else {
                sb.append("0" + " ");
            }
        }
        System.out.print(sb);
    }
}