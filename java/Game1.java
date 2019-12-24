public class Game1{

	public static void main(String[] args){
		int x,y;
		x=(int) (Math.random()*10);
		y=(int) (Math.random()*10);
		//System.out.println(x+" "+y);
		Grid1 grid=new Grid1(x,y);
		//System.out.println("created Object for Grid");
		//grid.createGrid(x,y);
		grid.findBall();
	}
}