import java.util.Scanner;

public class AI_VS_Human {

    public AI_VS_Human()
    {
        Board b =new Board();
        Scanner s =new Scanner(System.in);
        boolean flag=false;
        int count=0;

        while (!flag){

            if (count%2==0){

                int col = AlphaBeta.playBestMove(b,"AI");
                b.addPiece(col,"AI");
                System.out.println("Ai played in col: "+col);
                System.out.println("Ai: "+b.countFours("AI"));
                count++;

            } else {
                count++;
                System.out.println("Enter the column you want to play in, Human : ");
                b.addPiece(s.nextInt(),"Human");
                System.out.println("Human: "+b.countFours("Human"));
            }
            //b.printBoard();
            if (b.checkWinner() != 0){
                flag=true;
            } else if(b.isBoardFull()) {
                flag=true;
                System.out.println("The game is draw as both of you connected: "+b.countFours("AI")+" fours");
            } else {
                flag=false;
            }

        }
        s.close();
    }
}
