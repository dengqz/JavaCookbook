import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 查看当天日期
 *
 * @author dengqizhi
 * @date 2018/9/28 16:53
 */
public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDate dNow = LocalDate.now();
        System.out.println(dNow);
        LocalTime tNow = LocalTime.now();
        System.out.println(tNow);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
