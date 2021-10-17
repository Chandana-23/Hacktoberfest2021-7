public class Break
{
	public static void main(String[] args) {
		int n = 50;
		for(int i = 1;i<=n;i++)
		{
		  //  Skip all the multiples of 5
		  //  Stop the loop when it reaches a number i.e; 46
		  if (i==40)
		  {
		      System.out.println("Break the loop and exit");
		      break;
		  }
		  else
		  {
		      if (i%5==0)
		      {
		          System.out.println("Skipping multiple of 5");
		          continue;
		      }
		      else
		      {
		          System.out.println(i);
		      }
		  }
		}
	}
}


