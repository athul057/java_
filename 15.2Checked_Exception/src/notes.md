### Checked Exception...


In **Checked Exception** We have to deal with exception.Otherwise, It will give us error.
```java
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(5,0));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static double divide(int a,int b)throws Exception{

        if(b==0){
            throw new Exception("Cant'divide by zero");
        }
        return a/b;
    }
}
```
In the above example we are using **Checked** Exception.

Here we are **throws** the error and dealing with the exception by using **try** and **catch** method.
When we are creates a **Checked** exception we have to deal with the exception by using try and catch method.


`In Checked Exception we have to deal the exception by using try and catch method`



### Checked Exception

```java
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
```

Here we are we have to deal with the exception or pass the exception to higher methods.
In the above case we passes the exception to Higher methods upto the main method

From main method we resolve the Exception.

Always resolve the Exception from the Parents.