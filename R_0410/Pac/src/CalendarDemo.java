//package PAC;



import java.util.Calendar; //달력 가져오기
import java.util.Date;  //날짜 가져오기

public class CalendarDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		// Mon Apr 10 14:02:51 KST 2023   KST가 뭐야?

		Calendar c = Calendar.getInstance(); // 모든 정보를 출력함 겟 인스턴스!!! 영어좀 읽어!!!
		System.out.println(c);
		/*java.util.GregorianCalendar[time=1681103161945,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=6,SECOND=1,MILLISECOND=945,ZONE_OFFSET=32400000,DST_OFFSET=0]

 */

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));

		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}
}