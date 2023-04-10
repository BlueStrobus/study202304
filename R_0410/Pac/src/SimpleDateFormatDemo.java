import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 가져옴
        Date d = new Date();

        // 날짜와 시간을 지정된 형식으로 출력
        SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(sdf1.format(d));

        // 날짜를 지정된 형식으로 파싱하여 출력
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            d = sdf2.parse("2023-02-28");
        } catch (ParseException e) {
        }
        System.out.println(sdf1.format(d));

        // 현재 시간을 미국 로케일로 출력
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US);
        System.out.println("미국!!");
        System.out.println(sdf3.format(calendar.getTime()));

        // 현재 시간을 한국 로케일로 출력
        SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd", Locale.KOREA);
        System.out.println("한국!!");
        System.out.println(sdf4.format(calendar.getTime()));
    }
}