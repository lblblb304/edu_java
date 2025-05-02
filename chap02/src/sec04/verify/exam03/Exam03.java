package sec04.verify.exam03;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("1. 이름: ");
		String inputName = scanner.nextLine();
		System.out.println("2. 주민번호 앞 6자리: ");
		String inputCode = scanner.nextLine();
		System.out.println("3. 전화번호: ");
		String inputPhoneNumber = scanner.nextLine();
		
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.printf("1. 이름: %s", inputName);
		System.out.printf("\n2. 주민번호 앞 6자리: %s", inputCode);
		System.out.printf("\n3. 전화번호: %s", inputPhoneNumber);
	}
}