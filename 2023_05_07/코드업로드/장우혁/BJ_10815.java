import java.util.*;
import java.io.*;

public class BJ_10815 {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer tokens;
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(bf.readLine());	//상근이가 가진 숫자카드의 개수
		int[] arr = new int[N];
		tokens = new StringTokenizer(bf.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());	//상근이의 숫자카드
		}
		Arrays.sort(arr);		//이분탐색을 위한 정렬
		
		int M = Integer.parseInt(bf.readLine());	//숫자카드의 개수
		int num = 0;								//비교할 숫자카드
		tokens = new StringTokenizer(bf.readLine());
		int min = 0, max = N-1, mid = 0;
		boolean number = false;
		for(int i = 0; i < M; i++) {			//이분탐색을 위한 for
			min = 0;
			max = N-1;
			mid = 0;
			number = false;
			num = Integer.parseInt(tokens.nextToken());	//비교할 숫자카드 입력받기				
			while(min <= max) {
				mid = (min + max) / 2;	//중앙값 세팅
				if(arr[mid] > num) {	//mid가 가리키는값보다 비교할 숫자카드가 작으면
					max = mid - 1;
				}
				else if(arr[mid] < num) {	//mid가 가리키는 값보다 비교할 숫자카드가 크면
					min = mid + 1;
				}
				else {					//mid와 가리키는 값이 일치하는 경우
					number = true;
					break;
				}
			}
			if(number == false) {		//찾는 숫자카드가 없는경우
				bw.write("0 ");
			}
			else {						//찾는 숫자카드가 있느경우
				bw.write("1 ");
			}
		}
		bw.flush();
		
	}
}
