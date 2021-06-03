import java.util.Scanner;

class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");

        //Data types
        int a = 9089;
        long b = 100;

        float c = 2.33f;
        double d = 56.90009;

        // Input from the user.
        // consturctor ---> it has the same name as the class name --> initializing
        Scanner in=new Scanner(System.in);

        System.out.println("Enter an integer");
        a = in.nextInt();   //integer
        b = in.nextLong();  // long
        c = in.nextFloat(); // float
        d = in.nextDouble(); // double

        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("d "+d);

        String str = "Abcsdcsdnfj";
        char ch = 'v';

        String str1 = in.next();       //word
        str = in.nextLine(); //sentance
        System.out.println(str);

        ch = in.next().charAt(0);
        System.out.println(ch);
    }
}