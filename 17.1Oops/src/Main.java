//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat rose=new Cat("rose",2);
        Cat miya=new Cat ("miya",3);
        Cat bina=new Cat("bina",8);
        Cat cheru=new Cat("chiru",12);

        Person p1=new Person("athul",26);
        Cat [] myCat={rose,miya,bina};
        Person p2=new Person(myCat,"appu",20);

        System.out.println(p2);

    }
}