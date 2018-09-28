import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期格式化与解析例子
 *
 * @author dengqizhi
 * @date 2018/9/28 17:01
 */
public class DateFormatter {
    public static void main(String[] args) {
        //将一个日期格式化为ISO8601标准，但用斜线代替破折号
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/LL/dd");
        System.out.println(df.format(LocalDate.now()));

        //使用同一个格式化对象将字符串解析为日期
        System.out.println(LocalDate.parse("2014/04/01", df));

        //格式化一个日期时间，不含时区信息
        DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        System.out.println(ZonedDateTime.now().format(nTZ));
    }
}
