import java.io.*;
import java.util.*;

public class BJ_1680 {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer tokens;
	
	public static void main(String[] args) throws IOException {
		int testCase = Integer.parseInt(bf.readLine());		//테스트케이스
		int dis = 0, weight = 0, cnt = 0, test = 0;
		
		while(test < testCase) {
			tokens = new StringTokenizer(bf.readLine());
			int W = Integer.parseInt(tokens.nextToken());		//쓰레기차 용량
			int N = Integer.parseInt(tokens.nextToken());		//지점의 개수
			ArrayList<Integer> x = new ArrayList<>();			//지점까지의 거리
			ArrayList<Integer> t_w = new ArrayList<>();			//쓰레기의 양
			for(int i = 0; i < N; i++) {
				tokens = new StringTokenizer(bf.readLine());
				x.add(Integer.parseInt(tokens.nextToken()));	//거리와 쓰레기의 양
				t_w.add(Integer.parseInt(tokens.nextToken()));	//각각 ArrayList에 넣어줌
			}
			for(int i = 0; i < x.size(); i++) {			//각각의 테스트 케이스
				if(cnt == 0) {
					dis += x.get(i);
					cnt++;								//첫 지점 갈때만 0번째 인덱스 더하기
				}
				else {
					dis += x.get(i) - x.get(i - 1);		//거리 누적시키기
				}
			
				if(weight + t_w.get(i) > W) {	//용량이 같거나 초과한 경우
					dis += x.get(i) * 2;		//현재 위치부터 집까지 갔다가 다시 와
					weight = 0;
				}
				weight += t_w.get(i);	//무게 누적시키기
			}
			dis += x.get(x.size()-1);	//마지막 지점에서 소각장으로 다시 돌아오는 거리
			System.out.println(dis);
			cnt = 0;					//모든 항목 초기화
			dis = 0;
			weight = 0;
			test++;
		}
	}
}
