public class Game1
{
    public static void main(String[] args)
    {
        Grid grid;
        grid = new Grid(0,0,10,10);
        //for placing ball in random position
        Ball b1=new Ball();
        b1.placeBall(grid);
        Player player=new Player();
        player.findPath(b1,grid);
    }
}