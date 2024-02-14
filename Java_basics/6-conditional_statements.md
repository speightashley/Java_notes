# Conditional Statements

There are a selection of conditional statements in Java.
We can use:

- if
- if-else
- if-else-if
- switch
- ternary

## if

The if statement is used to execute a block of code if a condition is true.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    if (x < 10) {
      System.out.println("x is less than 10");
    }
  }
}
```

## if-else

The if-else statement is used to execute a block of code if a condition is true
and another block of code if the condition is false.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    if (x < 10) {
      System.out.println("x is less than 10");
    } else {
      System.out.println("x is greater than or equal to 10");
    }
  }
}
```

## if-else-if

The if-else-if statement is used to execute a block of code if a condition is
true, another block of code if the condition is false, and another block of
code if the condition is true.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    if (x < 10) {
      System.out.println("x is less than 10");
    } else if (x < 20) {
      System.out.println("x is less than 20");
    } else {
      System.out.println("x is greater than or equal to 20");
    }
  }
}
```

## switch

The switch statement is used to execute a block of code if one of many conditions
is true.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    switch (x) {
      case 0:
        System.out.println("x is 0");
        break;
      case 1:
        System.out.println("x is 1");
        break;
      case 2:
        System.out.println("x is 2");
        break;
      default:
        System.out.println("x is not 0, 1, or 2");
    }
  }
}
```

## ternary

The ternary statement is used to execute a block of code if a condition is true
and another block of code if the condition is false.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    String result = x < 10 ? "x is less than 10" : "x is greater than or equal to 10";
    System.out.println(result);
  }
}
```
