### Non Checked Exception(Run Time Exception).


```java

public class Main {
    public static void main(String[] args) {

divide(5,0);
divide(5,8);

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

```
Here through the **throws** we can identify that the function throws **IlleagalArgumentException**

Here the method will throws __IllegalArgumentException__.
