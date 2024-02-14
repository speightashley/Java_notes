# Variables in Java

<!--toc:start-->

- [Variables in Java](#variables-in-java)
  - [Example](#example)
  - [Types of Variables](#types-of-variables)
    - [Local variables](#local-variables)
    - [Global Variables](#global-variables)
  - [Data Types](#data-types)
    - [Size of Types](#size-of-types)
    - [Ranges of int types](#ranges-of-int-types)
    - [Ranges of double Types](#ranges-of-double-types)
  - [Defining Variables in Java](#defining-variables-in-java)
    - [Variable Naming Rules](#variable-naming-rules)
    - [Defining Integers](#defining-integers)
    - [Defining Longs](#defining-longs)
    - [Defining Floats](#defining-floats)
    - [Defining Doubles](#defining-doubles)
    - [Defining Shorts](#defining-shorts)
    - [Defining Characters](#defining-characters)
    - [Defining Strings](#defining-strings)
    - [Defining Booleans](#defining-booleans)
    - [Defining Bytes](#defining-bytes)
  - [Working with Literals](#working-with-literals) - [The following example shows how to use the binary representation](#the-following-example-shows-how-to-use-the-binary-representation) - [The following example shows how to use the hex representation](#the-following-example-shows-how-to-use-the-hex-representation) - [The following show ints with underscores in them](#the-following-show-ints-with-underscores-in-them) - [Incrementing and Decrementing](#incrementing-and-decrementing)
  <!--toc:end-->

A variable in Java is a name that can hold a value.
We need to give each variable a name and give it a value.

## Example

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x);
  }
}
```

The "int" is the type of variable.
The "x" is the name of the variable.
The "= 5" is the value of the variable.

## Types of Variables

There are two types of variables in Java:

- Local Variables
- Global variables

### Local variables

Local variables are declared inside a method or a block.
Local variables can only be used in that method or block.

### Global Variables

Global variables are declared outside a method or a block.
Global variables can be used in any method or block.

## Data Types

We can use different types of variables in Java.
We can use:

| Primitives | Non-Primitives         |
| ---------- | ---------------------- |
| int        | byte, short, int, long |
| double     | float, double          |
| char       | String                 |
| boolean    |                        |

### Size of Types

| Type    | bits | bytes |
| ------- | ---- | ----- |
| int     | 32   | 4     |
| double  | 64   | 8     |
| char    | 16   | 2     |
| boolean | 8    | 1     |
| String  | 32   | 4     |
| byte    | 8    | 1     |
| short   | 16   | 2     |
| long    | 64   | 8     |
| float   | 32   | 4     |

A char is 2 bytes because Java supports Unicode as opposed to just ASCII.
It makes it possible to use characters like emojis as well as non-English characters.

### Ranges of int types

| Type  | Range                                                   |
| ----- | ------------------------------------------------------- |
| byte  | -128 to 127                                             |
| short | -32,768 to 32,767                                       |
| int   | -2,147,483,648 to 2,147,483,647                         |
| long  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |

### Ranges of double Types

| Type   | Range                                             |
| ------ | ------------------------------------------------- |
| float  | -3.4028235E38 to 3.4028235E38                     |
| double | -1.7976931348623157E308 to 1.7976931348623157E308 |

## Defining Variables in Java

### Variable Naming Rules

- Variable names are case-sensitive.

- Variable names can start with an underscore.

- Variable names cannot start with a number.

- Variable names cannot contain special characters.

- Variable names cannot contain spaces.

### Defining Integers

Integers are whole numbers.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x);
  }
}
```

### Defining Longs

Longs are whole numbers. We need to put the L at the end of the number to define a long.
Long is a 64-bit integer.

```java
public class Variables {
  public static void main(String[] args) {
    long x = 5L;
    System.out.println(x);
  }
}
```

### Defining Floats

Floats are numbers with a decimal point.

```java
public class Variables {
  public static void main(String[] args) {
    float x = 5.5f;
    System.out.println(x);
  }
}
```

We need to put the f at the end of the number to define a float.

### Defining Doubles

Doubles are numbers with a decimal point but with more precision.

```java
public class Variables {
  public static void main(String[] args) {
    double x = 5.5D;
    System.out.println(x);
  }
}
```

We don't need to put the f at the end of the number to define a double.

### Defining Shorts

Shorts are whole numbers.
Short is a 16-bit integer. The range is -32,768 to 32,767.

```java
public class Variables {
  public static void main(String[] args) {
    short x = (short)3200;
    System.out.println(x);
  }
}
```

### Defining Characters

Characters are single letters.
We need to use single quotes to define the character.

```java
public class Variables {
  public static void main(String[] args) {
    char x = 'a';
    System.out.println(x);
  }
}
```

### Defining Strings

Strings are text.
We need to use double quotes to define the string.

```java
public class Variables {
  public static void main(String[] args) {
    String x = "Hello";
    System.out.println(x);
  }
}
```

### Defining Booleans

Booleans are true or false. In Java they can't be represented as 0 or 1 like in Python.

```java
public class Variables {
  public static void main(String[] args) {
    boolean x = true;
    System.out.println(x);
  }
}
```

### Defining Bytes

Bytes are whole numbers. Bytes need to be within the range of -128 to 127.
It won't compile if you try to use a number outside of that range.
Byte is a 8-bit integer.

```java
public class Variables {
  public static void main(String[] args) {
    byte x = (byte)123;
    System.out.println(x);
  }
}
```

## Working with Literals

We can define ints as a binary representation or hex representation.

### The following example shows how to use the binary representation

```java
public class Variables {
  public static void main(String[] args) {
    int x = 0b1010;
    System.out.println(x);
  }
}
```

### The following example shows how to use the hex representation

```java
public class Variables {
  public static void main(String[] args) {
    int x = 0xA;
    System.out.println(x);
  }
}
```

### The following show ints with underscores in them

```java
{
  public static void main(String[] args) {
    int x = 1_000_000;
    System.out.println(x);
  }
}
```

We use this to split up the number and to be able to see it better in the code.
The compiler doesn't interpret this.

### Incrementing and Decrementing

We can increment numbers with ++ and decrement numbers with --.

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    x++;
    System.out.println(x);
  }
}
```

This also works with chars like so:

```java
public class Variables {
  public static void main(String[] args) {
    char x = 'a';
    x++;
    System.out.println(x);
  }
}
```

The output of the above is b.
