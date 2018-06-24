package environ;

/**
 * 如何在Java程序中获取环境变量的值。
 * Created by cheese on 2018/6/24.
 */
public class GetEnv {
    public static void main(String[] args) {
        System.out.println("System.getEnv(\"PATH\")= "+System.getenv("PATH"));
    }
}
