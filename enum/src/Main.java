import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    enum colors{
        red,green,blue,yellow,white
    }
    public static void main(String[] args) {

        colors myColor=colors.white;
        System.out.println(myColor);
        System.out.println(Arrays.toString(colors.values()));

        for(colors color:colors.values()){
            System.out.println(color);
        }
    }
}