package AObject;


class GarbageCL {
	public int no; //int형 배열
	public GarbageCL(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n", no);
	}
	
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거\n", no);
	}
}


public class Garbage {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			new GarbageCL(i);
		
		System.gc();
	}

}
