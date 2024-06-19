import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("Enter your favouorite number");
        int num=sc.nextInt();

        System.out.println("hello "+input+" your favourite number is "+num);
    }
}