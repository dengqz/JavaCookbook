import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 日期/时间、YMDHMS和纪元秒（EpochSeconds）之间的转换
 *
 * @author dengqizhi
 * @date 2018/9/28 17:21
 */
public class DateConversion {
    public static void main(String[] args) {
        //将纪元秒转换为 local date/time
        Instant epochSec = Instant.ofEpochSecond(1000000000L);
        ZoneId zId = ZoneId.systemDefault();
        ZonedDateTime then = ZonedDateTime.ofInstant(epochSec, zId);
        System.out.println("The epoch was a billion seconds old on " + then);

        //将date/time 转换为纪元秒
        Long epochSecond = ZonedDateTime.now().toInstant().getEpochSecond();
        System.out.println("Current epoch seconds = " + epochSecond);
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime there = now.atZone(ZoneId.of("Canada/Pacific"));
        System.out.printf("When it's %s here, it's %s in Vancouver%n", now, there);
    }
}
