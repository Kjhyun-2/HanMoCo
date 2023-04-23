import java.io.*;
import java.util.StringTokenizer;

public class A_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) { // 스위치 상태 받기
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int student = Integer.parseInt(br.readLine()); // 학생수 입력받기
        for (int i = 0; i < student; i++) { // 학생 수만큼 for문 돌리기
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken()); // 성별
            int number = Integer.parseInt(st.nextToken()); // 받은 숫자
            if (gender == 1) { // 성별 남자
                for (int j = 1; j < N + 1; j++) {
                    if (j % number == 0) { // number의 배수일 경우
                        arr[j] = arr[j] == 1 ? 0 : 1;
                    }
                }
            } else { // 성별 여자
                int left = number - 1; // number 기준 왼쪽
                int right = number + 1; // number 기준 오른쪽
                arr[number] = arr[number] == 1 ? 0 : 1; // number 자신의 값은 무조건 바꾸기
                while (left > 0 && right <= N && arr[left] == arr[right]) { // number가 양 끝이 아니고 앞뒤 숫자가 같을때만 실행
                    arr[left] = arr[left] == 1 ? 0 : 1; // left 값을 1이면 0으로
                    arr[right] = arr[right] == 1 ? 0 : 1; // right 값을 1이면 0으로
                    left--; // 그 다음 앞뒤 숫자
                    right++; // 그 다음 앞뒤 숫자
                }
            }
        }
        for (int i = 1; i < N + 1; i++) { // 숫자 20 넘으면 엔터
            System.out.print(arr[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}