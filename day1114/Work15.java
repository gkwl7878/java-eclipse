package day1114;
/*
1. 아래의 값을 저장할 변수를 만들고 출력해 보세요.

   이니셜 : 'K', 나이 : 자신의나이, 왼눈시력 : 1.5, 오른눈 시력 : 0.8

   출력 : 나의 이니셜은 'K'이고, xx살입니다. 시력은 왼눈 xx, 오른눈 xx입니다.

*/
/*
class Work15 {
	public static void main(String[] args) {
		char initial = 'K';
		int age = 27;
		float left_eye = 1.5f;
		float right_eye = 0.8f;

		System.out.println("나의 이니셜은 "+initial+"이고, "+age+
			"살입니다. 시력은 왼눈 "+left_eye+", 오른눈 "+right_eye+"입니다.");		
	}
}
*///1번문제끝
/*
2. 기본형 데이터형에 대응되는 클래스를 Wrapper Class라고 한다. 
   Java Document에서 Wrapper클래스의 상수가 존재하는지 찾아보고 
   그에 대한 최소값과 최대값을 출력 한다. 
 
   출력 :  byte의 최소값 :  -128  최대값 : 127 
*/
class Work15 {
	public static void main(String[] args) {
		System.out.println("byte의 최소값: "+Byte.MIN_VALUE+" 최대값 :"+Byte.MAX_VALUE);
	}
}
