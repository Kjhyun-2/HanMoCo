import java.util.*;
import java.io.*;

public class B_20949 {  //x
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;

    static void arrPrint (int[] arr) {
        for(int i = 0 ;i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());
        int w, h;
        int[] ppi = new int[num];
        int[] ppiIndex = new int[num];                  //인덱스 번호를 가져오기위한 배열
        for(int i = 0; i < ppiIndex.length; i++) {      //각각 인덱스번호+1 을 넣어버리기(1~num+1)
            ppiIndex[i] = i+1;
        }

        for(int i = 0; i < num; i++) {
            tokens = new StringTokenizer(bf.readLine());
            w = Integer.parseInt(tokens.nextToken());
            h = Integer.parseInt(tokens.nextToken());
            ppi[i] = (w*w + h*h);                         //루트계산은 굳이 할필요 없다 판단!
        }
        System.out.println("\n정렬하기 전의 배열 상태");
        arrPrint(ppi); /////////////
        arrPrint(ppiIndex); /////////////
        System.out.println();
        
        for(int i = 0; i < ppi.length-1; i++) {         //정렬
            for(int j = i+1; j < ppi.length; j++) {
                if(ppi[i] < ppi[j]) {
                    int temp = ppi[i];                  //정렬 해주면서
                    ppi[i] = ppi[j];
                    ppi[j] = temp;

                    temp = ppiIndex[i];                 //인덱스번호도 같이 바꿧
                    ppiIndex[i] = ppiIndex[j];
                    ppiIndex[j] = temp;
                }
            }
        }

        System.out.println("정렬된 후의 배열 상태");
        arrPrint(ppi); /////////////
        arrPrint(ppiIndex); /////////////
        System.out.println();


        for(int i = 0; i < ppi.length; i++) {
            bw.write(String.valueOf(ppiIndex[i]) + "\n");
        }
        bw.flush();
    }
}
