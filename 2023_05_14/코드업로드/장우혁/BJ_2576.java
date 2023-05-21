import java.util.*;
import java.io.*;

public class BJ_2576 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] arr = new int[7];
        int total = 0, min = 100;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            if(arr[i] % 2 != 0) {
                total += arr[i];
                if(min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        if(total > 0) {
            bw.write(String.valueOf(total + "\n" + min));
            bw.flush();
            bw.close();
        }
        else {
            bw.write(String.valueOf(-1));
            bw.flush();
            bw.close();
        }

    }
}
