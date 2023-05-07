import java.util.*;
import java.io.*;

public class BJ_25314 {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args)throws IOException {
		int num = Integer.parseInt(bf.readLine());
		int result = num / 4;	//4로 나눈 몫
		String s = "long ";		
		String dap = "int";
		for(int i = 0; i < result; i++) {
			dap = s + dap;		//답에다가 하나씩 붙여주기
		}
		System.out.println(dap);
	}

}
