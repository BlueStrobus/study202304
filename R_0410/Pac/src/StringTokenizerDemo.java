import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        // 문자열 s를 정의한다.
        String s = "of the people, by the people, for the people";

        // StringTokenizer 객체 st를 생성하고, s를 " ," 기준으로 토큰화한다.
        StringTokenizer st = new StringTokenizer(s, " ,");

        // 토큰의 개수를 출력한다.
        System.out.println(st.countTokens());

        // 모든 토큰을 출력한다.
        while (st.hasMoreTokens()) {
            System.out.print("[" + st.nextToken() + "] ");
        }
    }
}