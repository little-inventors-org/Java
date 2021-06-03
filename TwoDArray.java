import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    int a[][]=new int[4][4];

    for(int i=0; i<4; i++)  {
      for(int j=0; j<4;j++) {
        a[i][j] = in.nextInt();
      }
    } 

    for(int i=0; i<4; i++)  {
      for(int j=0; j<4;j++) {
       System.out.print(a[i][j] + "  ");
      }
      System.out.println();
    } 

    in.close();
  }
}
