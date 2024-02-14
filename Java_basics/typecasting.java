// Byte range in Java is -128 to 127
// Int range in Java is -2147483648 to 2147483647
// Float range in Java is -3.4028235E38 to 3.4028235E38
// Double range in Java is -1.7976931348623157E308 to 1.7976931348623157E308
// Long range in Java is -9223372036854775808 to 9223372036854775807
// Short range in Java is -32768 to 32767
// Char range in Java is 0 to 65535
// Boolean range in Java is true or false
// String range in Java is 0 to 2147483647
//
// We get modulus when we cast int to byte

class typecasting {
  public static void main(String[] args) {

    byte b = 127;

    int a = b;

    float f = 5.6f;
    System.out.println(a); // We can typecast byte to int because byte is smaller than int
    // But we can't typecast int to byte
    ;
  }
}
