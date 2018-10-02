import java.util.Calendar;

public class Array1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //声明一个整型数组
        int[] monthLen1;
        //构造并分配内存
        monthLen1 = new int[12];
        //简短形式
        int[] monthLen2 = new int[12];
        //这种初始化形式更简短
        int[] monthLen3 = {
                31,28,31,30,
                31,30,31,31,
                30,31,30,31,
        };
        final int MAX = 10;
        Calendar[] days = new Calendar[MAX];
        for (int i = 0; i < MAX; i++) {
            //注意，这实际上是将GregorianCalendar等实例存入一个Calendar数组
            days[i] = Calendar.getInstance();
        }

        //二维数组
        //10*24的数组
        int[][] me = new int[10][];
        for (int i = 0; i < 10; i++) {
            me[i] = new int[24];
            //记住，数组有一个长度属性：“.length”
            System.out.println(me.length);
            System.out.println(me[0].length);
        }

    }
}
