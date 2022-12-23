import java.util.Scanner;
public class AI_VS_AI
{
	public AI_VS_AI ()
	{
		Board b =new Board();
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the depth of Ai 1 : ");
		int Ai1_depth=s.nextInt();
		System.out.print("Enter the depth of Ai 2 : ");
		int Ai2_depth=s.nextInt();
		boolean flag=false;
		int count=0;
		while (!flag){
			if (count%2==0)
			{
				Minimax.maxDepth=Ai1_depth;
				int col = Minimax.playBestMove(b,"AI");
				b.addPiece(col,"AI");
				System.out.println("Ai played in col: "+col);
				System.out.println("Ai: "+b.countFours("AI"));
				count++;
			}
			else
			{
				count++;
				Minimax.maxDepth=Ai2_depth;
				int col = Minimax.playBestMove(b,"Human");
				b.addPiece(col,"Human");
				System.out.println("Ai2: "+b.countFours("Human"));
			}
			if (b.checkWinner() != 0)
			{
				flag=true;
			} else if(b.isBoardFull())
			{
				flag=true;
				System.out.println("The game is draw as both of AI agents connected: "+b.countFours("AI")+" fours");
			}
		}
		s.close();
	}
}