public class Person {

    public static int count;

    static{
        System.out.println("static block initializer");
        count=0;
        System.out.println("end of static block");
    }
    {
        System.out.println("instance block initilized");
        count++;

    }

    public Person() {
        System.out.println("Default Constructor generated");
    }
}
