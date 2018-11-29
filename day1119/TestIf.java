package day1119;

/**
 * 조건문의 사용<br>
 * 단일 if문 : 조건에 맞는 경우에만 코드를 실행해야할 때.<br>
 * 문법) if(조건식){<br>
 * 조건에 맞을 때 수행할 문장들..;<br>
 * }
 * 
 * @author owner
 */
public class TestIf {
	// Constant: 변수를 상수처럼 사용할 때.(값을 변경하지 못하는 변수)
	public static final int FLAG_VALUE = 1250;
	public static final int FLAG_CNT = 20;

	public static void main(String[] args) {
		/*
		 * int i = -10;
		 * 
		 * if (i < 0) { i = -i; } // end if
		 * 
		 * System.out.println("i = " + i);
		 */
		// 이름을 입력받아 이름이 "이재찬"이면 이름을 출력하기 전
		// "반장"을 출력하고 그렇지 않다면 이름만 출력

		/*
		 * if (args[0].equals("이재찬")) { System.out.print(" 반장"); }
		 * System.out.println(args[0]);
		 * 
		 * // 숫자형태의 문자열을 정수로 변환 int i = Integer.parseInt(args[1]); int j =
		 * Integer.parseInt(args[2]);
		 * 
		 * System.out.println(i+" + "+j+" = "+(i+j));
		 */

		// args[3]을 입력받아 그 수가 20이내라면 1250과 입력수를 곱하여
		// 출력하고 20보다 크다면 1250에 10%를 더한 값과 입력수를 곱하여
		// 출력하세요.

		int i = Integer.parseInt(args[3]);
		int sum = (int) (i * (TestIf.FLAG_VALUE * 1.1));

		if (i <= TestIf.FLAG_CNT) {

			sum = i * TestIf.FLAG_VALUE;

		}

		System.out.println("출력값: " + sum);

	}// main

}// class
