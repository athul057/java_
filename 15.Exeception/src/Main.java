//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

try{

    int number=Integer.parseInt("1x");
    System.out.println(number);

    for(int i=10;i>=0;i--){
        System.out.println(10/i);

    }
    System.out.println("End");
}
catch (ArithmeticException|NumberFormatException e){
    System.out.println(e.getMessage());
}

//Catch all exception.
catch (Exception e){
    System.out.println("Some random Exeception");
}
finally {
    System.out.println("Finally Always runs");
}

    }


}

