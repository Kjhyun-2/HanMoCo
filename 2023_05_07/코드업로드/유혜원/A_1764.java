import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> d = new HashSet<String>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            d.add(br.readLine()); // 해쉬에 N개 값 입력
        }
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine(); // str에 M 값 입력
            if (d.contains(str)) { // 해쉬에 str이 있으면
                arr.add(str); // ArrayList arr에 값 추가
            }
        }
        Collections.sort(arr); // 사전순이므로 정렬
        System.out.print(arr.size()); // 사이즈 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("\n" + arr.get(i)); // arr 출력
        }
    }
}
