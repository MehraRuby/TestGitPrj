package mypack;

public class FactorialExample 
{
	public long fact(int x)
	{
		long temp=1;
		for(int i=1;i>=x;i--)
		{
			temp*=i;
		}
		return temp;
	}
	public static void main(String[] args)
	{
		
	}

}
