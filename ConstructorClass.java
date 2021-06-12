import java.util.Scanner;

public class ConstructorClass {
  int x = 0;
  int y = 0;

  // default constructor
  Main() {
  }

  // parameterised constructor
  Main(int xx)  {
    x = xx;
  }

  Main(int xx, int yy)  {
    x = xx;
    y = yy;
  }

  // Main method
  public static void main(String[] args) {
    Main ob1=new Main();
    System.out.println(ob1.x + "  " + ob1.y);

    Main ob2=new Main(5);
    System.out.println(ob2.x + "  " +ob2.y);

    Main ob3=new Main(5, 7);
    System.out.println(ob3.x + "  " +ob3.y);
  }
}
