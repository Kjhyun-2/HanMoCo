import java.util.*;
import java.io.*;
public class BJ_1764 {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer tokens;
	
	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		int cnt = 0;
		String Sname;
		String[] Lname = new String[n];	//듣도 못한 사람
		ArrayList<String> LSname = new ArrayList<>(); //듣도보도 못한사람 -> 몇명일지 몰라서 ArrayList선택
		for(int i = 0; i < Lname.length; i++) {	
			Lname[i] = bf.readLine();	//듣도못한사람 값 넣어주기
		}
		for(int i = 0; i < m; i++) {
			Sname = bf.readLine();	
			for(int j = 0; j < Lname.length; j++) {//보도못한사람 값과 듣도못한사람을 비교해서
				if(Lname[j].equals(Sname)) {//같으면 ArrayList에 넣기
					LSname.add(Sname);
				}
			}
		}
		Collections.sort(LSname);	//정렬
		
		System.out.println(LSname.size());
		for(String i : LSname) {
			System.out.println(i);
		}
		
		//hash set 써야 하더라고..ㅇㅅ
		
	}
}
