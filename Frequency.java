import java.util.*;

class Frequency {
  public static void main(String[] args) { 
    
    // creating scanner object
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter a string");
    String str = in.nextLine();
    
    System.out.println("Enter a character");
    char ch = in.next().charAt(0);
    
    // store the extracted character
    char ex;
    
    // store the frequency of the character
    int count = 0;
    	
    // length of the string
    int len = str.length();
    
    for(int i=0; i<len; i++)	{		// 0		1   2   3
    	ex = str.charAt(i);				  // J		a		v   a ...
        	
        if(ch == ex)					    // F	  T   F   T ...
        	count++;					      // 0    1   1   2 ... 
    }
    
    System.out.println("The number of occurances of " + ch + " is " + count);
  }
}
