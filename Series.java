public class Series{

     public static void main(String []args){
        int i = 1, n = 10;
        double sum = 0;
        
        for(; i<=n; i++)    {
            sum += 1/i;
        }
        
        System.out.println(sum);
     }
}
