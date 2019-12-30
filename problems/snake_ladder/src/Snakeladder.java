import java.util.Scanner;

public class Snakeladder
{
    private String winner=null;
    private boolean turn=true;
    public int rollDice()
    {
        Scanner input=new Scanner(System.in);
        input.nextLine();
        return  (int) ((Math.random()*6)+1);
    }

    public void movePiece(Player player,int diceValue,Board board)
    {
        int temporary;
        temporary=player.current_position+diceValue;
        if(temporary>100)
        {
            System.out.println("You cannot jump over 100");
            if(diceValue==6)
            {
                this.turn=!this.turn;
            }
        }
        else {
            player.current_position = board.newPosition(temporary);
        }

    }

    public static void main(String[] args)
    {
        int diceValue=0;
        Snakeladder snakeladder = new Snakeladder();
        Board board=new Board();
        Player player1=new Player("Naveen",1);
        Player player2=new Player("Manikanta",1);
        System.out.println("****** press ENTER key to roll dice ******");
        while(snakeladder.winner==null)
        {
            if(snakeladder.turn==true)
            {
                System.out.println(player1.name+"'s turn \t Your current possition is "+player1.current_position);
                diceValue=snakeladder.rollDice();
                System.out.println("Rolled value is "+diceValue);
                snakeladder.movePiece(player1,diceValue,board);
                if(player1.current_position==100)
                {
                    snakeladder.winner=player1.name;
                }
                System.out.println("your new position is "+player1.current_position+"\n------------------------------------------------");
                snakeladder.turn=!snakeladder.turn;
                if(diceValue==6 && player1.current_position!=100)
                {
                    System.out.println("Roll dice again");
                    snakeladder.turn=!snakeladder.turn;
                }

            }
            else
            {
                System.out.println(player2.name+"'s turn \t Your current possition is "+player2.current_position);
                diceValue=snakeladder.rollDice();
                System.out.println("Rolled value is "+diceValue);
                snakeladder.movePiece(player2,diceValue,board);
                if(player2.current_position==100)
                {
                    snakeladder.winner=player2.name;
                }
                System.out.println("your new position is "+player2.current_position+"\n------------------------------------------------");
                snakeladder.turn=!snakeladder.turn;
                if(diceValue==6 && player2.current_position!=100)
                {
                    System.out.println("Roll dice again");
                    snakeladder.turn=!snakeladder.turn;
                }
            }

        }
        System.out.println("Game won by "+snakeladder.winner);

    }
}
