package environ;

/**
 * 如何从系统中获取系统信息
 * Created by cheese on 2018/6/24.
 */
public class SysPropDemo {
    public static void main(String[] args) {
        //注释
        System.out.println(System.getProperty("pencil_color"));
        if(args.length==0){
            System.getProperties().list(System.out);
        }else{
            for (String s : args){
                System.out.println(s+"="+System.getProperty(s));
            }
        }
    }
}
