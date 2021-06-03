public class BinarySearch {
  public static void main(String[] args) {
    // Binary Search
    
    int a[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 100};
    
    int val = 23;
    int lb = 0, ub = a.length - 1;
    int mid = 0;
    boolean flag = false;
    
    while(lb<=ub)	{
    	mid = (lb+ub)/2;
        
        if(a[mid] == val)	{
        	flag = true;
            break;
        }
        else if(val < a[mid])	
        	ub = mid - 1;
        else if(val > a[mid])
        	lb = mid + 1;
    }
    
    if(flag)
    	System.out.println("Element found at " + mid + " position");
    else
    	System.out.println("Element not found");
  }
}
