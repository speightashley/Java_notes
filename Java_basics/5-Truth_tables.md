# Truth Table

[Truth Tables Wikipedia](https://en.wikipedia.org/wiki/Truth_table)

Truth tables give us an outcome for every possible combination of two inputs.

## Example

### AND

Here we are looking at the outcome of both x AND y.

```java
int x = 0;
int y = 1;
System.out.println(x & y);
```

Looking at the truth table, we can see that the outcome is 0 and thus the
statement is false.

### OR

With OR, we are looking at the outcome of either x OR y. We want to know if either
x or y is true.

```java
int x = 0;
int y = 1;
System.out.println(x | y);
```

Because y is true, the statement is true.

### XOR

XOR is looking at the outcome of x XOR y. We want to know if either x or y is
true but not both.

```java
int x = 0;
int y = 1;
System.out.println(x ^ y);
```

Here, the outcome is 1 because x is true and y is false and thus the statement
is true.

### NOT

NOT is looking at the outcome of NOT x. It's whatever the reverse of x is.

```java
int x = 0;
System.out.println(!x);
```

Here, the outcome is 1 because x is false and thus the statement is true.

## True Tables

### Truth Table for AND

| A   | B   | A AND B |
| --- | --- | ------- |
| 0   | 0   | 0       |
| 0   | 1   | 0       |
| 1   | 0   | 0       |
| 1   | 1   | 1       |

### Truth Table for OR

| A   | B   | A OR B |
| --- | --- | ------ |
| 0   | 0   | 0      |
| 0   | 1   | 1      |
| 1   | 0   | 1      |
| 1   | 1   | 1      |

### Truth Table for NOT

| A   | NOT A |
| --- | ----- |
| 0   | 1     |
| 1   | 0     |

### Truth Table for XOR

| A   | B   | A XOR B |
| --- | --- | ------- |
| 0   | 0   | 0       |
| 0   | 1   | 1       |
| 1   | 0   | 1       |
| 1   | 1   | 0       |

## Short Circuit

If the first statement is true, the second statement will not be executed in
the case of OR. It will return True because at least one of the statements is
true.

If the first statement is false, the second statement will not be executed in the
case of AND and it will return false.

```java
int x = 7;
int y = 5;
int a = 5;
int b = 9;

boolean result = (x > y) || (a < b); // True
boolean result = (x > y) && (a > b); // False
```
