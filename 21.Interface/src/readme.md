## Interface.

In interfaces we can include

- constants
- abstract methods
- default methods 

By default all interface classe's methods will be **public abstract**

So we don't have to specify it in the interface classes.

```java
public interface Vehicle {
      void Car();
      void Bicycle();
      void Scooter();
}
```
This is an example of interface class.

**Here We don't have to specify like this.**
```java
public interface Vehicle {
      public abstract void Car();
      public abstract void Bicycle();
      public abstract void Scooter();
}
```
Here we are not specifying the **public abstract** to any of the methods.
By default these methods will be __public abstract__

