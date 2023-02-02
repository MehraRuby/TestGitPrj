package mypack;

/**
 * Hello world!
 *
 */
public class App 
{
	 public boolean isEven(int n)
     {
  	   boolean flag;
  	   flag = (n % 2 == 0)?true:false;
  	   return flag;	   
     }

     public String check(String a, String b)
     {
  	   String result = a.equals(b)?"equals":"not equals";
  	   return result;
     }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        
       
        
    }
}
