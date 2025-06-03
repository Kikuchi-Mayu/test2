import java.util.Scanner;

public class Suzuki {
  public static void main(String[] args) {
    String name;
    try (Scanner scan = new Scanner(System.in)) {
      name = scan.nextLine();
    }
    System.out.printf("こんにちは%sさん", name);
  }
}
