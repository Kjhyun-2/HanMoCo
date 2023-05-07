import java.io.*;
import java.util.StringTokenizer;

public class A_1680 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken()); // 용량
            int n = Integer.parseInt(st.nextToken()); // 지점 개수
            int dis = 0; // 쌓인 거리 
            int what = w;// 현재 쓰레기 차에 넣을 수 있는 양
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int xi = Integer.parseInt(st.nextToken()); // 거리
                int wi = Integer.parseInt(st.nextToken()); // 양
                if (what - wi < 0) { // 용량보다 쓰레기 양이 더 많을 때 ->갔다 오면서 비우고 오기
                    dis += (xi * 2);
                    what = w - wi;
                } else if (what - wi == 0) { // 용량과 쓰레기 양 같을 때
                    dis += (xi * 2);
                    what = w;
                } else { // 용량보다 쓰레기 양 적을 때
                    what -= wi;
                }
                if (j == (n - 1)) { // 마지막 지점 
                    if (what != w) {// 적을 때
                        dis += (xi * 2);    //곱하기 2가 아니라 1아닌가 이거 왜 됐지
                    }                       //왔다갔다만 거리 계산하고 그냥 가는건 계산 안됐는데 그게 여기 포함된건가
                }
            }
            System.out.println(dis);
        }

    }
}