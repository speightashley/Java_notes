# Loops in Java

<!--toc:start-->

- [Loops in Java](#loops-in-java)
  - [for loop](#for-loop)
    - [Example of for loop](#example-of-for-loop)
  - [while loop](#while-loop)
    - [Example of while loop](#example-of-while-loop)
  - [do-while loops](#do-while-loops) - [Example of do-while loop](#example-of-do-while-loop)
  <!--toc:end-->

In Java we have the following loops:

- for
- while
- do-while

## for loop

The for loop is used to repeat a block of code a certain number of times.
The syntax is:

```java
for (initialization; condition; increment) {
  // code to be executed
}
```

### Example of for loop

```java
public class Variables {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }
}
```

## while loop

The while loop is used to repeat a block of code as long as a condition is true.

```java
while (condition) {
  // code to be executed
}
```

### Example of while loop

```java
public class Variables {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }
  }
}
```

## do-while loops

The do-while loop is used to repeat a block of code at least once.

```java
do {
  // code to be executed
} while (condition);
```

### Example of do-while loop

```java
public class Variables {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 10);
  }
}
```
