import java.util.*;

public class ArrayInit {
  public static void main(String[] args) {
    double arr[]=new double[4];
    
    System.out.println("Enter a number");
    
    Scanner in=new Scanner(System.in);
    for(int i=0; i<4; i++)	{
		    arr[i] = in.nextInt();
    }
    
    for(int i=0; i<4; i++)	{
    	System.out.println(arr[i]);
    }
    
    int len = arr.length;
    System.out.println(len);
  }
}
