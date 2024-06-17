//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    //THIS IS GLOBAL VARIBALE.....
    private static final String NAME="ATHUL";
    public static final double MYPI=3.14;


    public static void main(String[] args) {
        //THIS ARE LOCAL VARIABLE....
        System.out.println(NAME);
        var NAME="AKARSH";
        var country="INDIA";


        //Converting an String to double as well as integer....
        String a="1";
        double b=Double.parseDouble(a);
        int c=Integer.parseInt(a);
        System.out.println(b);
        System.out.println(c);

        //HERE IT WILL FIRST CHECK THE LOCAL VARIABLE...IT HAS HIGHER PREFERENCE.
        System.out.println(NAME);

    }
}