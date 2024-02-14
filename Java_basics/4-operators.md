# Operators in Java

<!--toc:start-->

- [Operators in Java](#operators-in-java)
  - [Examples](#examples)
    - [Using Add](#using-add)
    - [Using Subtract](#using-subtract)
    - [Using Multiply](#using-multiply)
    - [Using Divide](#using-divide)
    - [Using Modulus](#using-modulus)
    - [Using Increment](#using-increment)
    - [Using Decrement](#using-decrement)
    - [Using Bitwise and](#using-bitwise-and)
  - [Operator Shortcuts](#operator-shortcuts)
  - [The difference between ++num and num++](#the-difference-between-num-and-num)
  - [Comparison Operators](#comparison-operators)
  <!--toc:end-->

## Mathematical Operators

Operators in Java are similar to the operators in C/C++ and C#.

| Operator | Operation            |
| -------- | -------------------- |
| +        | Addition             |
| -        | Subtraction          |
| \*       | Multiplication       |
| /        | Division             |
| %        | Modulus              |
| &=       | Bitwise AND          |
| \|=      | Bitwise OR           |
| ^=       | Bitwise XOR          |
| >>=      | Right shift          |
| <<=      | Left shift           |
| >>>=     | Unsigned right shift |

## Examples

### Using Add

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x + y;
    System.out.println(z);
  }
}
```

### Using Subtract

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x - y;
    System.out.println(z);
  }
}
```

### Using Multiply

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x * y;
    System.out.println(z);
  }
}
```

### Using Divide

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x / y;
    System.out.println(z);
  }
}
```

### Using Modulus

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x % y;
    System.out.println(z);
  }
}
```

### Using Increment

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int z = ++x;
    System.out.println(z);
  }
}
```

### Using Decrement

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int z = --x;
    System.out.println(z);
  }
}
```

### Using Bitwise and

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = x & y;
    System.out.println(z);
  }
}
```

## Operator Shortcuts

Operator shortcuts can be used to make code more readable.
They are called in place operators.
The shortcuts are:

| Shortcut | meaning     |
| -------- | ----------- |
| +=       | x = x + y   |
| -=       | x = x - y   |
| \*=      | x = x \* y  |
| /=       | x = x / y   |
| %=       | x = x % y   |
| <<=      | x = x << y  |
| >>=      | x = x >> y  |
| >>>=     | x = x >>> y |
| &=       | x = x & y   |
| \|=      | x = x \| y  |
| ^=       | x = x ^ y   |
| x++      | x = x + 1   |
| x--      | x = x - 1   |

## The difference between ++num and num++

When we do num++ this is called postfix increment.
When we do ++num this is called prefix increment.

They behave differently when you fetch a value.

```java
int x = 7;
int result = x++; // Fetch the value first and then increment and 7 is
//assigned to result
int result = ++x; // Increment the value first and then fetch and 8 is assigned
//to result
System.out.println(y);
```

## Comparison Operators

To compare two values, we use the comparison operators.
The comparison operators are:

| Operator | Operation        |
| -------- | ---------------- |
| ==       | Equal            |
| !=       | Not Equal        |
| >        | Greater          |
| <        | Less             |
| >=       | Greater or Equal |
| <=       | Less or Equal    |

They always return a boolean value.
`

## Assignment Operators

Assignment operators are used to assign values to variables.
The assignment operators are:

| Operator | Operation |
| -------- | --------- |
| =        | Assign    |

## Logical Operators

Logical operators are used to combine boolean values.
The logical operators are:

| Operator | Operation |
| -------- | --------- |
| &&       | And       |
| \|\|     | Or        |
| !        | Not       |
