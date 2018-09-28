import java.time.LocalDate;
import java.time.Period;

/**
 * 日期或者日历的加减
 *
 * @author dengqizhi
 * @date 2018/9/28 18:19
 */
public class DateAdd {
    public static void main(String[] args) {
        //今天的日期值
        LocalDate now = LocalDate.now();
        Period p = Period.ofDays(700);
        LocalDate then = now.plus(p);
        System.out.printf("Seven hundred days from %s is %s%n", now, then);
    }
}
