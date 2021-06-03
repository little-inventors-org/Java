import java.util.*;

public class Fibonacci{

     public static void main(String []args){
        
        int a = 0, b = 1;
        
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int sum;
        
        System.out.print(a+ "  ");
        System.out.print(b+ "  ");
        
        for(int i=1; i<=n; i++)  {
            sum = a + b;
            System.out.print(sum + "  ");
            a = b;
            b = sum;
        }
        
        in.close();
     }
}
