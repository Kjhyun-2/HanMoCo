import java.util.*;
import java.io.*;

public class BJ_1205 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(tokens.nextToken()); 
        int newScore = Integer.parseInt(tokens.nextToken());
        int p = Integer.parseInt(tokens.nextToken());
        
        if(n == 0) {    //n이 0이라면 기존 rank에 있는 값이 없으므로 해당 입력값이 1위가 된다.
            bw.write(String.valueOf(1));
            return;
        }
        
        tokens = new StringTokenizer(bf.readLine());
        ArrayList<Integer> ranklist = new ArrayList<>();    //랭킹 리스트 생성
        
        for(int i = 0; i < n; i++) {
            ranklist.add(Integer.parseInt(tokens.nextToken()));
        }
        
        int rank = 1;
        if(ranklist.size() == p && newScore <= ranklist.get(ranklist.size()-1)) {    // 랭킹리스트가 가득 차 있고 입력값이 제일 작은 값과 같거나 작다면
            bw.write(String.valueOf(-1));
            return;
        }
        
        for(int i = 0; i < n; i++) {
            if(newScore >= ranklist.get(i)) {    // 랭킹 리스트의 특정 값보다 크거나 같다면 입력값의 순위는 i+1위가 된다.
                rank = i + 1;
                break;
            }else {                            // 랭킹 리스트의 특정 값보다 작은 경우 순위를 한단계 낮추고 다음 값과 비교한다.
                rank++;
            }
        }
        
        if(rank <= p) {                        //정해진 rank가 랭킹 리스트에 들어갈 수 있는 순위이면 rank를 출력 아닌경우 -1 출력
            bw.write(String.valueOf(rank));
        }else {
            bw.write(String.valueOf(-1));
        }
        bw.flush();
        bw.close();
    }
}
