import java.util.Scanner;

public class Main {
  int arr[] = new int[15];

  Main() {
    for (int i = 0; i < 15; i++)
      arr[i] = 0;
  }

  Main(Scanner sc) { // class is a data type
    System.out.println("Enter values");
    for (int i = 0; i < 15; i++)
      arr[i] = sc.nextInt();
  }

  void readList(Scanner sc) {
    System.out.println("Enter values");
    for (int i = 0; i < 15; i++)
      arr[i] = sc.nextInt();
  }

  void displayList()  {
    // 'this' refers to the current calling object
    for (int i = 0; i < 15; i++) {
      System.out.print(this.arr[i] + "  ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Main ob = new Main(in); // passing scanner object
    Main obj = new Main(in);
    obj.displayList();
    ob.displayList();
  }
}
