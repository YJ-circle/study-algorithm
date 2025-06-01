package array;

import java.io.*;
import java.util.*;

/**
 * 문제:
 *
 * 세 개의 자연수 A, B, C가 주어질 때
 * A × B × C를 계산한 결과에 0부터 9까지
 * 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어 A = 150, B = 266, C = 427 이라면
 * A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 *
 */
public class B2577_숫자의_개수 {
	public static void main(String[] args) throws Exception {
		int[] userInput = getUserInput();
		int multiplyValue = multiply(userInput);
		int[] solve = solve(multiplyValue);
		Arrays.stream(solve)
			.forEach(System.out::println);
	}

	private static int[] getUserInput() throws Exception {
		int[] userInput = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			try{
				userInput[i] = Integer.parseInt(br.readLine());
			} catch(NumberFormatException e){}
		}
		return userInput;
	}

	/**
	 * 1000 * 1000 * 1000은 10억이므로 int 타입 사용 OK
	 */
	private static int multiply(int[] userInput) {
		return userInput[0] * userInput[1] * userInput[2];
	}

	private static int[] solve(int multiplyValue) {
		int[] result = new int[10];

		int temp = multiplyValue;
		while (true) {
			int value = temp % 10;
			temp /= 10;
			result[value]++;
			if (temp < 10) {
				result[temp]++;
				break;
			}
		}
		return result;
	}
}
