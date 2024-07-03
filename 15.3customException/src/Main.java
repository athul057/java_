//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            divide2(5,0);
        } catch (MyUnCheckedException e) {
            System.out.println(e.getMessage());
        }


    }

    public static double divide2(int a,int b){
        throw new MyUnCheckedException("can't divide with zero");
    }


    public static double divide(int a,int b) throws MyCheckedException{
        if(b==0){
            throw new MyCheckedException("Can't Divide with zero");
        }
        return a/b;
    }
}