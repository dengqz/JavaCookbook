import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 将字符串解析为日期
 *
 * @author dengqizhi
 * @date 2018/9/28 17:55
 */
public class DateParse {
    public static void main(String[] args) {
        String armisticeDate = "1914-11-11";
        LocalDate aLD = LocalDate.parse(armisticeDate);
        System.out.println("Date: " + aLD);

        String armisticeDateTime = "1914-11-11T11:11";
        LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
        System.out.println("Date/Time: " + aLDT);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMMM uuuu");
        String anotherDate = "27 九月 2011";
        LocalDate random = LocalDate.parse(anotherDate, df);
        System.out.println(anotherDate + " parses as " + random);
        System.out.println(aLD + " formats as " + df.format(aLD));
    }
}
