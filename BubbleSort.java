import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    // Bubble Sort
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the number of elements in the array");
    int n = in.nextInt();

    int a[] = new int[n];   
    int t; 

    System.out.println("Enter "+ n +" numbers");
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }

    for(int i=0; i<n-1; i++)  {
      for(int j=0; j<n-1-i; j++)  {
        if(a[j] > a[j+1]) {
          t = a[j];
          a[j] = a[j+1];
          a[j+1] = t;
        }
      }
    }

    System.out.println("Sorted elements");
    for(int i=0; i<n; i++) {
      System.out.println(a[i]);
    }

    in.close();
  }
}
