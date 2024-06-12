//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //we can't use var for local attribute
    private int a=555;
    public static void main(String[] args) {
        var a=5;
        var b=8;
        var name="Athul";
        var c=1_00_000_0;
        test(a,b);
    }



    //Same way we can't use the var as parameters also.But we can pass var as arguments.
    public static void test(int a,int b){
        System.out.println(a+b);
    }
}