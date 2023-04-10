//package 
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {



        char [] a1 = {'J', 'a', 'v', 'a'}; //
        char [] a2 = Arrays.copyOf(a1, a1.length); // copyOf : 원본 배열을 길이만큼 a2에 복사
		System.out.println(a2);

		String[] sa = { "케이크", "애플", "도넛", "바나나" };
		print(sa);

		Arrays.sort(sa); // sort 글자순 정렬
		print(sa);

		System.out.println(Arrays.binarySearch(sa, "애플")); 
        // binarySearch : 두 배열의 동일 여부 비교

		Arrays.fill(sa, 2, 4, "기타"); // (sa, 2, 4, "기타")
        // void fill (배열, 시작, 끝, 값) : 배열의 지정된 영역에 지정된 값을 저장
		print(sa);
	}

	static void print(Object[] oa) {   // System.out~ 않써서 출력하려면 필요함.
		for (Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}
}

/*(Object o : oa)는 for-each 루프의 문법입니다. 이 구문은 객체 배열 oa의 각 요소를 반복하면서, 반복할 때마다 현재 요소를 o 변수에 할당합니다.

즉, oa 배열의 첫 번째 요소부터 마지막 요소까지 반복하면서, 현재 요소를 o 변수에 할당하고 루프 내에서 o 변수를 사용할 수 있습니다. 이렇게 하면 배열 요소를 인덱스로 직접 접근하는 것보다 코드가 더 간결해지고 가독성이 높아집니다.

예를 들어, print 메소드에서 for-each 루프를 사용하여 Object[] oa 배열의 요소를 출력하는 것이 가능한 것입니다. */