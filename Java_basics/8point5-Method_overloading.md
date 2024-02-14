# Method Overloading

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
