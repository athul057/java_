### Primitive Data Type Wrapper Class


- byte->Byte
- char->Character
- int->Integer
- double->Double
- long->Long
- float->Float
- boolean->Boolean
- short->Short

Primitive are stored inside a stack
Objects are stored inside a Heap. 

These wrapper  class will give us so many methods for those perticular Data types.
```java
public static void main(String args[]){
    int a=20;
    Integer b=45;
    Double c=50.55;
    var val="57";
    int k=Integer.parseInt(val);
    Double h=Double.parseDouble(val);

    System.out.println(Integer.max(30,55));

    String myVal=Integer.toString(69);
    System.out.println(myVal);


}

```

Through the wrapper classes we can access so many methods.