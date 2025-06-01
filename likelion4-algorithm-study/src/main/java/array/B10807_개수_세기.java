package array;

import java.io.*;
import java.util.*;
public class B10807_개수_세기 {
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			// 전체 정수 개수 입력
			int numberCount = Integer.parseInt(br.readLine());

			// 정수 배열 입력
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());

			// 개수 셀 수 입력
			int condition = Integer.parseInt(br.readLine());

			// 계산
			int result = 0;
			for(int i = 0; i < numberCount; i++){
				if(Integer.parseInt(tokenizer.nextToken()) == condition){
					result++;
				}
			}
			System.out.println(result);
		};
	}
}
