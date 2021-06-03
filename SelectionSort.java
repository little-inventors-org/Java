import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    // Selection Sort
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the number of elements in the array");
    int n = in.nextInt();

    int a[] = new int[n];   
    int t; 

    System.out.println("Enter "+ n +" numbers");
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }

    for(int i=0; i<n; i++)  {
      int min = i;
      for(int j=i+1; j<n; j++)  {
        if(a[min] > a[j]) {
          min = j;
        }
      }
      t = a[min];
      a[min] = a[i];
      a[i] = t;
    }

    System.out.println("Sorted elements");
    for(int i=0; i<n; i++) {
      System.out.println(a[i]);
    }

    in.close();
  }
}
