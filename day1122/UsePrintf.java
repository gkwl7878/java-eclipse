package day1122;

/**
 * 출력 method
 * @author owner
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.fpr,("정수%d",11);
//		System.out.printf("정수%d",11);
		System.out.printf("정수[%d][%5d][%-5d]\n",11,22,39);
		System.out.printf("문자[%c][%5c],[%-5c]\n",'A','B','C');
		System.out.printf("문자열[%s][%10s][%-10s]\n","자바","자바","자바");
		System.out.printf("실수[%.2f][%5.2f][%-5.2f]\n",3.141592,3.141592,3.141592);
		System.out.printf("오늘은 %d년%d월%d일 %s요일 시력은 %.2f입니다.",2018,11,22,"목",1.5);
	}//main
}//class
