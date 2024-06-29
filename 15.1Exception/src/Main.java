import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            divide(5,0);
            divide(5,8);
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
//throws ----->>>>> Will tell us which exception the specific method will throw......
    //Here the method will throws IllegalArgumentException.

    public  static double divide(int a,int b) throws IllegalArgumentException{
        if(b==0){
                throw new IllegalArgumentException("Can't divide by zero");
        }
        return a/b;
    }
}