//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String name1="ali";
        String name2="ali";

        String name3=new String("ali");

        System.out.println(name1==name2);
        System.out.println(name1==name3);


        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        }
    }