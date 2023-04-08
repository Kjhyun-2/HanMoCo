import java.util.*;
import java.io.*;

public class B_1244 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;

    public static void man(int[] arr, int num) {        //남자
        for(int i = num; i < arr.length; i*=2) {        //num의 배수
            if(arr[i] == 0) {                           //0이면 1
                arr[i] = 1;
            }
            else if(arr[i] == 1){                                      //1이면 0
                arr[i] = 0;
            }
        }
    }

    public static void woman(int[] arr, int num) {  //여자
        if(arr[num] == 0) {                         //0이면 1     //일단 뽑은 숫자 먼저 바꿔주기
                arr[num] = 1;
        }
        else if(arr[num] == 1){                     //1이면 0
                arr[num] = 0;
        }
        int cnt = 1;

        while((num - cnt) > 0 && (num + cnt) < arr.length) {       //arr범위 밖으로 나가면 false
            if(arr[num+cnt] == arr[num-cnt]) {      //arr과 대칭되는곳의 숫자가 같으면
                if (arr[num + cnt] == 0) {          // 0이면 1
                    arr[num + cnt] = 1;
                    arr[num - cnt] = 1;
                }
                else if(arr[num + cnt] == 1){                              // 1이면 0
                    arr[num + cnt] = 0;
                    arr[num - cnt] = 0;
                }
                cnt++;
            }
            else {
                break;
            }
        }

    }

    public static void arrPrint(int[] arr) throws IOException {
        for(int i = 1; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i] + " "));
            if(i % 20 == 0) {
                bw.write(String.valueOf("\n"));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[Integer.parseInt(bf.readLine()) + 1];   //스위치배열 생성 -> 스위치가 1부터 시작하니까 1 더 큰 배열을 만들어서 1부터 저장.
        tokens = new StringTokenizer(bf.readLine());
        for(int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokens.nextToken()); // onoff상태 arr에 삽입
        }
        int stu = Integer.parseInt(bf.readLine());              //학생수
        
        int gender, num;
        for(int i = 0; i < stu; i++) {                          //스위치 바꾸기
            tokens = new StringTokenizer(bf.readLine());
            gender = Integer.parseInt(tokens.nextToken());      //성별
            num = Integer.parseInt(tokens.nextToken());         //받은 숫자
            
            if(gender == 1) {                                   //1이면 남자 아니면 여자
                man(arr ,num);
            }
            else {
                woman(arr, num);
            }
        }
        arrPrint(arr);
        bw.flush();
    }
}
