# Type Conversion and Type Casting in Java

<!--toc:start-->

- [Type Conversion and Type Casting in Java](#type-conversion-and-type-casting-in-java)
  - [Introduction](#introduction)
    - [Example of Type Conversion](#example-of-type-conversion)
    - [Example of Type casting](#example-of-type-casting)
  - [What happens when we try to put a float into an int?](#what-happens-when-we-try-to-put-a-float-into-an-int)
  - [What happens when we try to put an int above 256 into a byte?](#what-happens-when-we-try-to-put-an-int-above-256-into-a-byte)
  <!--toc:end-->

## Introduction

Type conversion is the process of converting one data type to another.
Type casting is the process of converting one data type to another.

### Example of Type Conversion

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    double y = x;
    System.out.println(y);
  }
}
```

The above example is converting an int into a double.
We can do this because the range of int fits in the range of double.
It is done automatically without us having to specify a type on the assignment
of it.

If we look at the opposite and try putting an int of 256 into a byte, it won't work:

```java
public class Variables {
  public static void main(String[] args) {
    byte b = 127;
    int a = 256;
    b = a;
    System.out.println(b);
  }
}
```

The above won't work because the range of int doesn't fit in the range of byte.

The opposite way will work because the range of byte fits in the range of int.

### Example of Type casting

```java
public class Variables {
  public static void main(String[] args) {
    int x = 5;
    double y = (double)x;
    System.out.println(y);
  }
}
```

With type casting, we can convert from one type to another implicitly
by specifying the type when assigning it.

## What happens when we try to put a float into an int?

```java
public class Variables {
  public static void main(String[] args) {
    float x = 5.5f;
    int y = (int)x;
    System.out.println(y);
  }
}
```

We will lose the decimal part of the float when we convert it into an int.

## What happens when we try to put an int above 256 into a byte?

When we try to put a number above 256 into a byte, it will wrap around from 0
to 255.
It will give us the modulus of 256.

```java
public class Variables {
  public static void main(String[] args) {
    int a = 257;
    byte b = (byte)a;
    System.out.println(b);
  }
}
```

The above will give us 1 because it wrapped around from 0 to 255.

Because byte is only 8 bits, it can only contain numbers between 0 and 255.

It takes the least significant 8 bits of the number and assigns it to the byte.

The "least significant" bits in a binary number are the bits on the right-hand
side, or the ones that contribute the least to the value of the number. In a
binary number, each bit represents a power of 2, with the rightmost bit
representing 2^0 (1), the next bit to the left representing 2^1 (2), and so on.

When we talk about the "least significant 8 bits," we are referring to the
rightmost 8 bits in an 8-bit binary representation. In Java, the byte data
type is 8 bits, so when you cast an int to a byte, only the least significant
8 bits of the int value are considered.

For example, let's consider the binary representation of the int value 200:

```java
 int value:  0011001000 (binary representation)
                  ↑
        least significant bit
```

For the values int(127), int(128) and int(200), the least significant 8
bits are 01111111, 10000000, and 00110010, respectively.

This gives us:

```yaml
Original int value: 127
Converted byte value: 127

Original int value: 128
Converted byte value: -128

Original int value: 200
Converted byte value: -56

Original int value: 1000
Converted byte value: -24

```

The signed bytes are because the first bit is the sign bit. If it is set, the
value is negative. If it is not set, the value is positive.
