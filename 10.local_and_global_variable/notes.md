## Parse Int and Parse Double

To convert string to Integer as well as String to Double 


we can use `parseInt() and parseDouble()` methods...

this will be in `Integer` and `Double` class in java


`
String a="1";
double b=Double.parseDouble(a);
int c=Integer.parseInt(a);
`


GLOBAL VARIABLE

can be accesby by outside class also


LOCAL VARAIBLE.

can have local scope only...
scope on function.

```java
public class Main {


    //THIS IS GLOBAL VARIBALE.....
    private static final String NAME="ATHUL";
    public static final double MYPI=3.14;


    public static void main(String[] args) {
        //THIS ARE LOCAL VARIABLE....
        System.out.println(NAME);
        var NAME="AKARSH";
        var country="INDIA";


        //Converting an String to double as well as integer....
        String a="1";
        double b=Double.parseDouble(a);
        int c=Integer.parseInt(a);
        System.out.println(b);
        System.out.println(c);

        //HERE IT WILL FIRST CHECK THE LOCAL VARIABLE...IT HAS HIGHER PREFERENCE.
        System.out.println(NAME);

    }
}
```

When we use `public static final double MYPI=3.14;` since it is public variable 
we access the value from any class 
In  my code I am accessing the `MYPI` value from another class....

`private static final String NAME="ATHUL";
public static final double MYPI=3.14;`

Here both are defined as global variable.



### Local variable 
defined inside the scope of a method.

``var NAME="AKARSH";
var country="INDIA";``

These variables are defined as local varibles....

When ther is 1 local varibale and 1 global varible have same name 

More preference is for `Local variable`.