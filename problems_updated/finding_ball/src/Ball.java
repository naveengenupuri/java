public class Ball
{
    Position position;
    public Ball(int xcoordinate,int ycoordinate)
    {
        position=new Position(xcoordinate,ycoordinate);
    }
    public Position getPosition()
    {
        return this.position;
    }


}