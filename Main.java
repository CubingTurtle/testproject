import java.util.Scanner;

class Main {
  public static void main(String []args) {
    Scanner read = new Scanner (System.in);
    System.out.println("Hello user, how are you doing");
    String input = read.nextLine();
    System.out.println("Your input was: " + input);
  }
}
