# Object oriented programming in Java

Every object knows something and every object does something.

You must remember that **Everything is an object!**

## Classes

To create an object, we need a class.
JVM creates an object from the class.

A class is defined as a component.

A component can be made up of other components.

```java
class Calculator {
  // code
  // methods
  public int add(int a, int b) { // Public defines that the method is public
    return a + b;
  }
}

```

## Objects

```java

public class Main {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
    Calculator calc = new Calculator(); // new creates an object
    int result = calc.add(num1, num2);
    System.out.println(result);
  }
}
```

## Methods

```java
public void playMusic() { // Public defines that the method is public
                          // void defines that the method returns nothing
  // code
}

public String getMePen(int){
  return "pen";
}

```

### Method Overloading

We can use the same method names with different parameters on classes.
This is called method overloading.

An example would be the add method in the Calculator class.
We can use the same method name with different parameters.

```java
public int add(int a, int b) {
  return a + b;
}
public int add(int a, int b, int c) {
  return a + b + c;
}
public int add(int a, int b, int c, int d) {

}
```
