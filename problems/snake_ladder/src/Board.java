public class Board{
    protected final int[] snake_ladder_start={2,4,9,47,70,71,16,52,78,93,95,99};
    protected final int[] snake_ladder_end={45,27,31,84,87,91,8,28,25,89,75,21};

    public int newPosition(int temporary) {
        int iteration;
        boolean checker=false;
        for(iteration=0;iteration<snake_ladder_start.length;iteration++)
        {
            if(temporary==snake_ladder_start[iteration])
            {
                temporary=snake_ladder_end[iteration];
                checker=true;
                break;
            }

        }

        if(checker) {
            if (snake_ladder_start[iteration] < snake_ladder_end[iteration]) {
                System.out.println("You climbed Ladder");
            } else{
                System.out.println("Your were bitten by a snake");
            }
        }
        return temporary;
    }
}