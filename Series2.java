// 1 - 1/ 2 + 1/3 - 1/4 + 1/5 - ..... + 1/n


public class Series2{

     public static void main(String []args){
        int i = 1, n = 10;
        double sum = 0;
        
        for(; i<=n; i++)    {
            if(i % 2 == 0)
                sum -= 1/i;
            else sum += 1/i;
        }
        
        System.out.println(sum);
     }
}
