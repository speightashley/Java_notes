# Java Virtual Machine

JVM is the part of the Java Runtime Environment (JRE) that runs the Java program.

JVM is part of the Java Development Kit (JDK)

## Stack Memory

Inside the JVM we have a Last in First out (LIFO) stack.

In stack we store all of the variables that are created in the program.

Every method in Java has its own stack.

Within that stack we have local variables.

Local variables are created when a method is called.

### Example of the Main Stack

```java
class Calculator {
  int num = 5;

  public int add(int a, int b) {
    return a + b;
  }
}

public class Variables {
  public static void main(String[] args) {
    int data = 10;
    String a = "Hello";
    Calculator calc = new Calculator();

    int r1 = calc.add(10, 20);
    System.out.println(i);
  }
}
```

#### Main Stack

| Variable | Value   |
| -------- | ------- |
| a        | "hello" |
| data     | 10      |
| r1       |         |

When r1 is reached, it creates a new stack because it is a new method.

#### add Stack

| Variable | Value |
| -------- | ----- |
| a        | 10    |
| b        | 20    |

Now the main stack will assign 30 to r1 and we will have:

| Variable | Value | Description                                             |
| -------- | ----- | ------------------------------------------------------- |
| obj      | 101   | <- This is a reference to the object on the heap        |
| r1       | 30    | <- This is the value of r1 after calling the add method |
| b        | 20    | <- This is the value of b. A local variable             |
| a        | 10    | <- This is the value of a. A local variable             |

obj is a reference to the Calculator object. This reference is stored in the stack.
The object itself is stored in the heap.

## Heap Memory

Inside the JVM we have a First in First out (FIFO) heap.

In heap we store all of the objects that are created in the program.

Every object in Java has its own heap.

Within that heap we have instance variables and static variables.

### Example of an object in the heap

ID = 101
| Variable | Value | description |
| -------- | ----- | ------------------------------- |
| num | 5 | <- This is an instance variable |
| add() | / | <- This is a method |

## Local variables, instance variables and static variables

### Local Variables

Local variables are created when a method is called.
They are only accessible within the method.

### Instance Variables

Instance variables are created when an object is created.
They are accessible within the class.

### Static Variables

Static variables are created when the class is loaded.
They are accessible within the class and all objects.
