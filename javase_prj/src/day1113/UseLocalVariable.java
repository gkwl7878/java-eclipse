package day1113;

//�������� ���� ���
class UseLocalVariable{

	public static void main(String[] args){
	//1. �������� ����: �������� ������;
	int i;//�ڵ��ʱ�ȭ�� ���� �ʴ´�.
	int j=11; //������ �ʱ�ȭ:������ �����ϸ鼭 �� �Ҵ�
	//2. ���Ҵ�: ������=��;
	i=100;//�ʱ�ȭ ���� ���� ������ ����ϸ� error
				
	//3. �� ���:���,����,���Ҵ�
	System.out.println(i);
	System.out.println(j);
	
	//int i=200; ���� �̸��� ������ �ۼ��� �� ����.
	
	//�������� �ѱ۷� �����ϳ� �ѱ��� ������� x

	long l=3000000000L;
	System.out.println(l);

	}//main


}//class