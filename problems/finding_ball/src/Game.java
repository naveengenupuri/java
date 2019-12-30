public class Game
{
    public static void main(String[] args)
    {
        Grid grid;
        grid = new Grid(0,0,10,10);
        Ball ball=new Ball();
        ball.placeBall(grid);
        Player player=new Player();
        player.ballPath(ball,grid);
    }

}