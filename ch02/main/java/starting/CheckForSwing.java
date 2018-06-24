package starting;

/**
 * 需要编写与当前所用JDK版本相关的代码（例如，查看你所运行的Java版本）
 * Created by cheese on 2018/6/24.
 */
public class CheckForSwing {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.specification.version"));
        try{
            Class.forName("javax.swing.JButton");
        }catch (ClassNotFoundException e){
            String failure =
                    "Sorry, but this version of MyApp needs \n"+
                            "a Java Runtime with JFC/Swing components\n"+
                            "having the final names (javax.swing.*)";
            System.err.println(failure);
        }
    }
}
