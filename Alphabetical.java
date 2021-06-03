// Write a program in java to enter a word in mixed case (both upper and lowercase) and display the new word after arranging them in alphabetical order.

public class Alphabetical {
  public static void main(String[] args) {
    String str = "JavaIsFun";		// aaFIJnsuv
    String ns = "";
    char chr;
    
    for(int i=97; i < 122; i++)	{	// compare a - z
    	for(int j=0; j<str.length(); j++)	{	// traveling through the string
        	char ch = str.charAt(j);	// J a v a I s F u n
            
            if(ch < 97)	{
            	chr = (char)((int)ch + 32);	// j f
            } else chr = ch;			// a
            
            if(chr == i)	{			// aaF
            	ns += ch;
            }
        }
    }
    
    System.out.println(ns);
  }
}
