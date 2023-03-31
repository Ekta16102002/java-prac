public class reverse {
  public static void main(String[] args) {
    StringBuilder sd = new StringBuilder("jimin");
    System.out.println(sd);

    for (int i = 0; i < sd.length() / 2; i++) {
      int front = i;
      int back = sd.length() - 1 - i;

      char frontchar = sd.charAt(front);
      char backchar = sd.charAt(back);

      sd.setCharAt(front, backchar);
      sd.setCharAt(back, frontchar);

    }
    System.out.println(sd);
  }

}
