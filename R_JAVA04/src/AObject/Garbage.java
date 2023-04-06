package AObject;


class GarbageCL {
	public int no; //int형 배열
	public GarbageCL(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n", no);
	}
	
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거\n", no);
		//가비지의 생성 순서와 수거 순서는 무관
	}
}


public class Garbage {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			new GarbageCL(i);
		
		System.gc();  //가비지 콜랙터 (자바 버추얼머신)JBM에게 요청
	}

}
