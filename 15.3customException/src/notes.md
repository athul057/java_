## Creating our own Exception...

We can create our own Custom error Exception 


**Checked Exception**

```java

public class MyCheckedException extends Exception{
    public  MyCheckedException(String message){
        super(message);
    }
}

```

**UnChecked Exception**

```java
public class MyUnCheckedException extends Exception{
    
    public MyUnCheckedException(String message) {
        super(message);
    }
}

```

```java
public class Main {
    public static void main(String[] args) {

        try {
            divide(5,0);
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }


    }

    public static double divide(int a,int b) throws MyCheckedException{
        if(b==0){
            throw new MyCheckedException("Can't Divide with zero");
        }
        return a/b;
    }
}

```