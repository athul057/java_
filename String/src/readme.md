In java Strings are stored inside a string pool.




![stringBehaviour](/src/img.png)







````java
String name1="ali";
String name2="ali";
````

so here bot will stored inside the string of Heap;



we can also define String like this...
````
String name3=new String("ali");
````

through the above way the string will stored inside the Heap memroy 


Both type of string declaration is not equal
to check the equality of string variable we often use `.equals` method in java


```java
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
```
This is the prefered way to check the string equality in java

