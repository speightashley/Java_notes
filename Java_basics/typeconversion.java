//class Conversions {
//  public static void main(String[] args) {
//    byte b = 127;
//    int i = b;
//    System.out.println(i);
//  }
//}

// This works because byte is smaller than int

class Conversions {
  public static void main(String[] args) {
    int i = 513;
    byte b = (byte) i;
    System.out.println(b);
  }
}
