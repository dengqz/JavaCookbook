import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 与传统日期和日历类的接口
 *
 * @author dengqizhi
 * @date 2018/9/28 18:22
 */
public class LegacyDates {
    public static void main(String[] args) {
        //使用Date
        Date legacyDate = new Date();
        System.out.println(legacyDate);

        LocalDateTime newDate = LocalDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        System.out.println(newDate);

        //使用Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        LocalDateTime newCal = LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
        System.out.println(newCal);
    }
}
