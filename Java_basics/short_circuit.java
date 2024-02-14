class short_circuit {
  public static void main(String[] args) {
    int x = 7;
    int y = 5;

    boolean result = x < y && 10 > y;

    System.out.println(result);
  }
}
