public class Board {
    private Snake snake[] = new Snake[6];
    private Ladder ladder[]=new Ladder[6];
    public Board()
    {


        initializeSnakes();
        initializeLadders();
    }
    public int checkSnake(int position)
    {
        for(int i=0;i<snake.length;i++)
        {
            if(snake[i].getHead()==position)
            {
                System.out.println("You landed on a Snake");
                position=snake[i].getTail();
            }
        }
        return position;
    }
    public int checkLadder(int position)
    {
        for(int i=0;i<ladder.length;i++)
        {
            if(ladder[i].getLadderStart()==position)
            {
                System.out.println("You Climbed Ladder");
                position=ladder[i].getLadderEnd();
            }
        }
        return position;
    }
    private void initializeSnakes()
    {
        snake[0]=new Snake(16,8);
        snake[1]=new Snake(52,28);
        snake[2]=new Snake(78,25);
        snake[3]=new Snake(93,89);
        snake[4]=new Snake(95,75);
        snake[5]=new Snake(99,21);
    }
    private void initializeLadders()
    {
        ladder[0]=new Ladder(2,45);
        ladder[1]=new Ladder(2,27);
        ladder[2]=new Ladder(9,31);
        ladder[3]=new Ladder(47,84);
        ladder[4]=new Ladder(70,87);
        ladder[5]=new Ladder(71,91);

    }

}
