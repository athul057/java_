import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BigDecimal num1=new BigDecimal(0.1);
        BigDecimal num2=new BigDecimal((0.3));
        BigDecimal res=num2.subtract(num1);
        System.out.println(res);

        BigDecimal num5=num2.add(new BigDecimal(0.5));
        System.out.println(num5);

        }
    }
