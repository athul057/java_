//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat mia=new Cat("mia",3);
        System.out.println(mia.getAge());
        System.out.println(mia.getName());


        System.out.println(mia);
        ;

        ;


        Cat rose1=new Cat("rose",2);
        Cat rose2=new Cat("rose",2);
        System.out.println(rose2.getClass());
        System.out.println(rose2.equals(rose1));


    }
}