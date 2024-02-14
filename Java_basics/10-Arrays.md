# Arrays

Arrays are used to store multiple values in a single variable.

## Constructing an array

### Declaring variables that are not in an array

In a normal setup with just variables we can do this:

```java
int a = 10;
int b = 20;
int c = 30;
```

### Creating a new array of fixed length

In arrays we can do this:

```java
int[] numbers = new int[3];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
```

The creates a fixed sized array with 3 elements.
The elements must be of the same type which in this case is int.

When we declare the array with `new` we have to specify the size.
The initial values are all set to 0 until we set them individually.

### Creating an array with values

Or

```java
int[] numbers = {10, 20, 30};
```

Here, the size is determined at runtime.

## Accessing an array

```java
int[] numbers = {10, 20, 30};
```

To access each value we can do this:

```java
int a = numbers[0];
int b = numbers[1];
int c = numbers[2];
```

Each element has an index which is the position in the array.
The index starts at 0.

## Changing values in an array

```java
int[] numbers = {10, 20, 30};
```

To change the value we can do this:

```java
numbers[0] = 100;
```

## Looping over an array

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
  System.out.println(numbers[i]);
}
```

## Multi Dimensional Arrays

```java
int[][] numbers = {
  {10, 20, 30},
  {40, 50, 60}
};
```

Or

```java
int[][] numbers = new int[2][3];
numbers[0][0] = 10;
numbers[0][1] = 20;
numbers[0][2] = 30;
numbers[1][0] = 40;
numbers[1][1] = 50;
numbers[1][2] = 60;
```

### Looping over multi dimensional arrays

```java
int numbers[][] = new int[3][4];

int random = (int) (Math.random() * 100);

for (int i = 0; i < numbers.length; i++) {
  for (int j = 0; j < numbers[i].length; j++) {
    numbers[i][j] = random;
    System.out.println(numbers[i][j]);
  }
}
```

## Enhanced for loop

Another type of for loop that you might be referring to is the enhanced for
loop, also known as the "for-each" loop. It is specifically designed for
iterating over collections, arrays, or other iterable objects.

Here's an example of the enhanced for loop:

```java
int numbers[][] = new int[3][4];

int random = (int) (Math.random() * 100);

for (int[] row : numbers) {
  for (int number : row) {
    number = random;
    System.out.println(number);
  }
}
```

You can use the enhanced for loop with any iterable object, such as
arrays, collections, or other classes that implement the Iterable interface.

## Jagged Arrays

Jagged arrays are arrays that have different lengths for each element.
This is useful for multidimensional arrays.

```java
int[][] numbers = new int[3][];
numbers[0] = new int[2];
numbers[1] = new int[3];
numbers[2] = new int[4];
```

## Creating Arrays of Objects

Lets first create a student class and then create an array of students

```java
class Student {
  int rollnumber;
  String name;
  int marks;
}

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollnumber = 1;
    s1.name = "Ashley";
    s1.marks = 100;

    Student s2 = new Student();
    s2.rollnumber = 2;
    s2.name = "John";
    s2.marks = 90;

    Student s3 = new Student();
    s3.rollnumber = 3;
    s3.name = "Jane";
    s3.marks = 80;

    Student students[] = new Student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

  }
```
