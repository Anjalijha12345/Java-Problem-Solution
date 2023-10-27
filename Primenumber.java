import java.util.*;
class Prime
{
	public static void main(String args[])
	{
     Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a no.:");
	   int n=sc.nextInt();
	   sc.close();
	   int i,c=0;
	   for(i=1;i<=n;i++)
	   {
	      if(n%i==0)
		  {
		      c++;
		  }
	   }
	   if(c==2)
	   {
	      System.out.println("The no. is prime no.");
	   }
	   else
	   {
	      System.out.println("The not is not a prime no.");
	   }
	}
}
