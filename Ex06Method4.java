

public class Ex06Method4 {
	static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			String selection = MenuScreen();
			System.out.println();

			if (selection.equals("1")) {
				int[] numbers = selectWinningNumbers();				
				int mean = mean(numbers);
				
				showNumbers(numbers, mean);

			} else if (selection.equals("2")) {
				System.out.println("Good Luck ~ !!!");
			} else {
				System.out.println("지원하지 않는 기능입니다.");
			}
			System.out.println();

		}
	}

	static void showNumbers(int[] numbers, int mean) {
		System.out.println("SELECTION NUMBERS : ");
		for (int number : numbers) {
			System.out.printf("[%2d]", number);
		}
		System.out.printf("\n[MEAN : %d]", mean);
		System.out.println();
	}

	static String MenuScreen() {

		System.out.println("-+-+-+-+-+-+-+-+-");
		System.out.println("1. ♡ 로또 당첨 번호 ♡");
		System.out.println("2. 번 호 출 력 종 료");
		System.out.println("-+-+-+-+-+-+-+-+-");
		System.out.print("작업을 선택하세요 : ");
		String selection = scanner.nextLine();

		return selection;
	}

	static int mean(int[] numbers) {

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		int mean = sum / numbers.length;

		return mean;

	}

	static int[] randomNumber2() {
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { 
				if (numbers[i] == numbers[j]) {
					i--;
					break;
									
				}
			}
		} return numbers;
	}
	
	static int[] selectWinningNumbers() {
		int[] numbers = new int[6];
		int mean = 0;		
		do {
			numbers = randomNumber2();
			mean = mean(numbers);
		} while (mean < 20 || mean > 26);
		
		return numbers;
	} 

}
