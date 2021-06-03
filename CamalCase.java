public class CamalCase {
  public static void main(String[] args) {
    String str = "Java is fun";		// javaIsFun
    String ns = "";
    
    char ch = str.charAt(0);		// J
    
    if(Character.isUpperCase(ch))	{
    	ch = Character.toLowerCase(ch);
    }
    
    ns += ch;						// j
    
    for(int i = 1; i < str.length(); i++)	{
    	ch = str.charAt(i);
        
        if(ch == ' ')	{
            ch = str.charAt(i+1);		// I	F
            ch = Character.toUpperCase(ch);
            i++;
        }
        ns += ch;				//javaIs
    }
    
    System.out.println(ns);
  }
}
