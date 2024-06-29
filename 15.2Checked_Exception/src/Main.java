//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            antony();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }


        static void antony() throws Exception{
            john();
        }


        static  void john() throws Exception{
             divide(6, 0);
        }

        public static double divide(int a,int b)throws Exception{

        if(b==0){
            throw new Exception("Cant'divide by zero");
        }
        return a/b;
    }
}




//try {
//        System.out.println(divide(5,0));
//        }
//        catch (Exception e){
//        e.printStackTrace();
//        }