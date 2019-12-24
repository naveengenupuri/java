public class Grid1{
	private int x,y;
	public Grid1(int xcor,int ycor)
	{
		x=xcor;
		y=ycor;
	}
	public void priPath(int xp,int yp){
		System.out.println("Printing path for ball"+xp+""+yp);
		int i,j;
		for(i=0;i<=xp;i++)
		{
			System.out.println("("+i+",0)");
		}
		for(j=0;j<=yp;j++)
		{
			System.out.println("("+xp+","+j+")");
		}
	}
	public void findBall()
	{
		int a=0,b=0;
		int flag=0;
		for(a=0;a<=9;a++)
		{
			for(b=0;b<=9;b++)
			{
				if(a==x && b==y)
				{
					System.out.println("found the ball at "+a+" "+b);
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		priPath(a,b);
	}
}