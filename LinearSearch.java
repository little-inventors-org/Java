public class LinearSearch {
  public static void main(String[] args) {
    // Linear Search
    
    int a[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 100};
    
    int val = 23, i;
    boolean flag = false;
    
    for(i=0; i<a.length; i++)	{
    	if(a[i] == val)	{
        	flag = true;
            break;
        }
    }
    if(flag)	
    	System.out.println("Element found at " + i +" index");
    else System.out.println("Element not found");
  }
}
