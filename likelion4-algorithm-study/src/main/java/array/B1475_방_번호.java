package array;

public class B1475_방_번호 {
	/**
	 * 의사코드
	 * 방 번호를 붙이려함
	 * 6, 9는 같음
	 * 0-9 한세트 임.
	 *
	 * 6+9 / 2 값
	 * 6 1
	 * 9 2
	 * 3 / 2 = 1.5 <- 올림
	 *
	 */
	public static void main(String[] args) throws Exception {
		int read;
		int[] input = new int[10];
		while ((read = System.in.read()) != 10 && read != 13) {
			input[read - 48] = input[read - 48] + 1;
		}
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (i != 6 && i != 9) {
				if (count < input[i]) {
					count = input[i];
				}
			}
		}
		double sum = input[6] + input[9];
		int ceil = (int)Math.ceil(sum / 2);
		if (count < ceil) {
			count = ceil;
		}

		System.out.println(count);
	}
}
