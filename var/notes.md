We can use`var` keyword instead of using int,boolean,char,String 
java will automatically determines its type
But the problem with `var` keyword is it can only be used as local variable .
Can't use for attributes.


same way we can't use `var` keyword as parameters.

```java
public void test(int a,int b){
System.out.println(a+b);
}
```

Here  inside the function's parameters we can't use var .But `we can pass the var arguments into the function It will work`


```java

var a =5;
var b=6;
test(a,b);
```